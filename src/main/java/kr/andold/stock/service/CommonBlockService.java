package kr.andold.stock.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import kr.andold.utils.Utility;
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
			return String.format("CrudList(creates: #%d, duplicates: #%d, updates: #%d, removes: #%d)", Utility.size(creates), Utility.size(duplicates), Utility.size(updates), Utility.size(removes));
		}

	}

	List<Y> update(List<Y> domains);

	Y toDomain(String line);

	Y toDomain(Z entity);

	Z toEntity(Y domain);

	int compare(Y after, Y before);

	void prepareCreate(Y domain);

	void prepareUpdate(Y before, Y after);

	String key(Y domain);

	List<Y> search(X param);

	int remove(List<Y> domains);

	List<Y> create(List<Y> domains);

	default String download() {
		List<Y> domains = search(null);
		return Utility.toStringJsonLine(domains);
	}

	default CrudList<Y> upload(MultipartFile file) {
		try {
			InputStream inputStream = file.getInputStream();
			String lines = Utility.extractStringFromText(inputStream);

			List<Y> list = new ArrayList<>();
			for (String line : lines.split("\n")) {
				Y domain = toDomain(line);
				list.add(domain);
			}
			return put(list);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	default CrudList<Y> put(List<Y> afters) {
		if (afters == null || afters.isEmpty()) {
			return new CrudList<Y>().clear();
		}

		List<Y> befores = search(null);
		CrudList<Y> list = differ(befores, afters);
		list.setRemoves(null);
		batch(list);
		return list;
	}

	default int batch(CrudList<Y> list) {
		int count = 0;

		List<Y> creates = list.getCreates();
		if (creates != null && !creates.isEmpty()) {
			List<Y> created = create(list.getCreates());
			count += Utility.size(created);
		}

		List<Y> remvoes = list.getRemoves();
		if (remvoes != null && !remvoes.isEmpty()) {
			count += remove(list.getRemoves());
		}

		List<Y> updates = list.getUpdates();
		if (updates != null && !updates.isEmpty()) {
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

	default int dedup(List<Y> domains) {
		CrudList<Y> result = new CrudList<Y>().clear();
		List<Y> removes = result.getRemoves();
		Map<String, Y> mapUpdates = new HashMap<>();

		Map<String, Y> map = new HashMap<>();
		for (Y domain : domains) {
			String key = key(domain);
			Y y = map.get(key);
			if (y == null) {
				map.put(key, domain);
			} else {
				Utility.copyPropertiesNotNull(domain, y, "id", "updated", "created");
				removes.add(domain);
				mapUpdates.put(key, y);
			}
		}
		result.getUpdates().addAll(mapUpdates.values());
		return batch(result);
	}

}
