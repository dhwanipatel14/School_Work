public class Heap_SP {
	int[] heap;
	int[] index;
	Double[] distances;
	int n = 0; // actuall heap size .
	int CAPACITY = 1000001; // array size

	public Heap_SP() {
		heap = new int[CAPACITY];
		index = new int[CAPACITY];
		distances = new Double[CAPACITY];
		for (int i = 0; i < CAPACITY; i++)
			index[i] = -1;
	}

	public boolean isEmpty() {
		return n == 0;
	}

	public int removeMin() {
		int min = heap[1];
		swap(1, n);
		n--;
		sink(1);
		index[min] = -1;
		distances[min] = null;
		return min;
	}

	public void insert(Integer node, Double dist) {
		n++;
		heap[n] = node;
		index[node] = n;
		distances[node] = dist;
		swim(n);
	}

	private void swim(int k) {
		while (k > 1 && greater(k / 2, k)) {
			swap(k, k / 2);
			k = k / 2;
		}
	}

	public void put(int node, double dist) {
		if (index[node] != -1) {
			distances[node] = dist;
			swim(index[node]);
		} else
			insert(node, dist);
	}

	private void swap(int i, int j) {
		Integer temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
// add code to keep track of the index of nodes
		index[heap[i]] = i;
		index[heap[j]] = j;
	}

	private void sink(int k) {
		while (2 * k <= n) {
			int j = 2 * k;
			if (j < n && greater(j, j + 1))
				j++;
			if (!greater(k, j))
				break;
			swap(k, j);
			k = j;
		}
	}

	private boolean greater(int i, int j) {
// add code here . return true if the dist to i is greater
		if((distances[heap[i]].compareTo(distances[heap[j]]))>0){
			return true;
		}
		
		return false;
	}
}