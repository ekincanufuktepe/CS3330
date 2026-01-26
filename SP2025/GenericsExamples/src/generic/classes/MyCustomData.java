package generic.classes;

public class MyCustomData <K> {
	private K data;
	
	public MyCustomData(K data) {
		this.data = data;
	}

	public K getData() {
		return data;
	}

	public void setData(K data) {
		this.data = data;
	}
	
}
