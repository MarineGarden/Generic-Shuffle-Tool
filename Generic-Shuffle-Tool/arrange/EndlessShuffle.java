package arrange;

import java.util.LinkedList;
import java.util.List;

public class EndlessShuffle<T> {
	
	private final LinkedList<T> matrix = new LinkedList<T>();
	private int timesOfUse;
	
	public EndlessShuffle(List<T> matrix) {
		this.matrix.addAll(Shuffle.done(matrix));
		System.out.println(this.matrix);
	}
	
	public T next() {
		loopMatrix();
		if(timesOfUse == matrix.size() - 1) {
			timesOfUse = 0;
			List<T> wholeButFirst = matrix.subList(1, matrix.size());
			T first = matrix.get(0);
			matrix.clear();
			matrix.add(first);
			matrix.addAll(wholeButFirst);
			System.out.println(first);
			return first;
		}
		else {
			timesOfUse++;
			System.out.println(matrix.get(0));
			return matrix.get(0);
		}
	}
	
	private void loopMatrix() {
		matrix.addLast(matrix.removeFirst());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EndlessShuffle<Integer> test = new EndlessShuffle<Integer>(new IndexShuffle(3).get());
		
		
	}

}
