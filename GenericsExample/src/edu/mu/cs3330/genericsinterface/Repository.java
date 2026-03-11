package edu.mu.cs3330.genericsinterface;

public interface Repository<T> {
	
	public boolean push(T item);
	public boolean pull(T item);

}
