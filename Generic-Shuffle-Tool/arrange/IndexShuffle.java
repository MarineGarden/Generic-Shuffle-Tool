package arrange;

import java.util.ArrayList;
import java.util.List;

public class IndexShuffle {
	
	private final List<Integer> matrix = new ArrayList<Integer>();
	private final Shuffle<Integer> shuffle;
	
	public IndexShuffle(int size) {
		shuffle = new Shuffle<Integer>(generateNumbers(size));
	}
	
	private List<Integer> generateNumbers(int size) {
		return (addNumberToMatrix(size)) ? generateNumbers(size) : matrix;
	}
	
	private boolean addNumberToMatrix(int size) {
		return matrix.add(matrix.size()) ? matrix.size() < size : false;
	}
	
	public List<Integer> get() {
		return shuffle.done();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new IndexShuffle(3).get());
	}

}
