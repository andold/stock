package kr.andold.stock.domain;

public interface CommonBlockDomain<K, E> {
	E toEntity();
	int compare(K before);
	int compareIfNotNull(K before);
	String key();

}
