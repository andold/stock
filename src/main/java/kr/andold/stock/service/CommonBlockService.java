package kr.andold.stock.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CommonBlockService<X, Y, Z> {
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

	default String put(List<Y> items) {
		List<Y> before = search(null);
		List<Y> creates = new ArrayList<>();
		List<Y> duplicates = new ArrayList<>();
		List<Y> updates = new ArrayList<>();
		List<Y> removes = new ArrayList<>();
		differ(before, items, creates, duplicates, updates, removes);
		return batch(creates, duplicates, updates, removes).toString();
	}

	default Integer batch(List<Y> creates, List<Y> duplicates, List<Y> updates, List<Y> removes) {
		int count = 0;
		if (creates != null) {
			List<Y> created = create(creates);
			count += Utility.size(created);
		}
		if (removes != null) {
			count += remove(removes);
		}
		if (updates != null) {
			count += Utility.size(update(updates));
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

	default void differ(List<Y> befores, List<Y> afters, List<Y> creates, List<Y> duplicates, List<Y> updates, List<Y> removes) {
		Map<String, Y> mapBefore = makeMap(befores);
		Map<String, Y> mapAfter = makeMap(afters);
		for (String key : mapBefore.keySet()) {
			Y after = mapAfter.get(key);
			if (after == null) {
				removes.add(mapBefore.get(key));
				continue;
			}
		}
		for (String key : mapAfter.keySet()) {
			Y before = mapBefore.get(key);
			Y after = mapAfter.get(key);
			if (before == null) {
				prepareCreate(after);
				creates.add(after);
				continue;
			}

			if (compare(after, before) == 0) {
				duplicates.add(before);
				continue;
			}

			prepareUpdate(before, after);
			updates.add(before);
		}
	}

	default Map<String, Y> makeMap(List<Y> domains) {
		Map<String, Y> map = new HashMap<>();
		for (Y domain : domains) {
			map.put(key(domain), domain);
		}
		return map;
	}

}
