package kr.andold.stock.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public interface CommonBlockService<X, Y, Z> {
	@Builder
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public class CrudList<Y> {
		private List<Y> creates;
		private List<Y> duplicates;
		private List<Y> updates;
		private List<Y> removes;
		CrudList<Y> clear() {
			if (creates == null) {
				creates = new ArrayList<>();
			} else {
				creates.clear();
			}
			if (duplicates == null) {
				duplicates = new ArrayList<>();
			} else {
				duplicates.clear();
			}
			if (updates == null) {
				updates = new ArrayList<>();
			} else {
				updates.clear();
			}
			if (removes == null) {
				removes = new ArrayList<>();
			} else {
				removes.clear();
			}
			
			return this;
		}

		@Override
		public String toString() {
			return String.format("CrudList(creates: #%d, duplicates: #%d, updates: #%d, removes: #%d)"
					, Utility.size(creates), Utility.size(duplicates), Utility.size(updates), Utility.size(removes));
		}

	}

	List<Y> update(List<Y> domains);
	Y toDomain(Z entity);
	Z toEntity(Y domain);
	int compare(Y after, Y before);
	void prepareCreate(Y domain);
	void prepareUpdate(Y source, Y target);
	String key(Y domain);
	List<Y> search(X param);
	int remove(List<Y> domains);
	List<Y> create(List<Y> domains);

	default String download() {
		List<Y> domains = search(null);
		return Utility.toStringJsonLine(domains);
	}

	default CrudList<Y> put(List<Y> items) {
		List<Y> before = search(null);
		CrudList<Y> list = differ(before, items);
		batch(list);
		return list;
	}

	default Integer batch(CrudList<Y> list) {
		int count = 0;
		if (list.getCreates() != null) {
			List<Y> created = create(list.getCreates());
			count += Utility.size(created);
		}
		if (list.getRemoves() != null) {
			count += remove(list.getRemoves());
		}
		if (list.getUpdates() != null) {
			count += Utility.size(update(list.getUpdates()));
		}

		return count;
	}

	default List<Y> toDomains(List<Z> entities) {
		List<Y> domains = new ArrayList<>();
		for (Z entity : entities) {
			domains.add(toDomain(entity));
		}
		return domains;
	}

	default List<Z> toEntities(List<Y> domains) {
		List<Z> entities = new ArrayList<>();
		for (Y domain : domains) {
			entities.add(toEntity(domain));
		}
		return entities;
	}

	default CrudList<Y> differ(List<Y> befores, List<Y> afters) {
		CrudList<Y> result = new CrudList<Y>().clear();
		Map<String, Y> mapBefore = makeMap(befores);
		Map<String, Y> mapAfter = makeMap(afters);
		for (String key : mapBefore.keySet()) {
			Y after = mapAfter.get(key);
			if (after == null) {
				result.getRemoves().add(mapBefore.get(key));
				continue;
			}
		}
		for (String key : mapAfter.keySet()) {
			Y before = mapBefore.get(key);
			Y after = mapAfter.get(key);
			if (before == null) {
				prepareCreate(after);
				result.getCreates().add(after);
				continue;
			}

			if (compare(after, before) == 0) {
				result.getDuplicates().add(before);
				continue;
			}

			prepareUpdate(before, after);
			result.getUpdates().add(before);
		}
		return result;
	}

	default Map<String, Y> makeMap(List<Y> domains) {
		Map<String, Y> map = new HashMap<>();
		for (Y domain : domains) {
			map.put(key(domain), domain);
		}
		return map;
	}

}
