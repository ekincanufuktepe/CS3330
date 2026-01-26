package generic.classes;

import java.util.List;

public class PairData <K, V> {
	private K key;
	private V value;
	
	public PairData(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "PairData [key=" + key + ", value=" + value + "]";
	}
	
	
	
}
