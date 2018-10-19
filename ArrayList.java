
public class ArrayList implements List {

	Object[] data=new Object[10];
	int size = 0;

	public void add(Object obj) {
		if(size>=data.length) {
			growArray();
		}
		data[size++] = obj;
	}

	@Override
	public void add(int pos, Object obj) {
		if(size>=data.length) {
			growArray();
		}
		for (int i = size; i > pos; i--) {
			data[i] = data[i-1];
		}
		data[pos] = obj;
		size++;
	}

	@Override
	public Object get(int pos) {
		return data[pos];
	}

	@Override
	public Object remove(int pos) {
		Object o = data[pos];
		for (int i = pos; i < size-1; i++) {
			data[i] = data[i+1];
		}
		size--;
		return o;
		
	}
	
	void growArray() {
		Object[] arr = new Object[data.length * 2];
		for (int i = 0; i < data.length; i++) {
			arr[i] = data[i];
		}
		data = arr;
	}
	@Override
	public int size() {
		return size;
	}

}
