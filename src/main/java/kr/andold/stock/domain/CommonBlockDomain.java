package kr.andold.stock.domain;

public interface CommonBlockDomain<K, E> {
	E toEntity();
	int compare(K before);
	String key();

}
