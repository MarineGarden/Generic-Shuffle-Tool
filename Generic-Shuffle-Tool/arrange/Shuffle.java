package arrange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shuffle<T> {
	
	private final List<T> matrix = new ArrayList<T>();
	private final List<T> matrixCopy = new ArrayList<T>();
	
	public Shuffle(List<T> matrix) {
		this.matrix.addAll(matrix);
	}
	
	public static <T> List<T> done(List<T> matrix) {
		return new Shuffle<T>(matrix).done();
	}
	
	public List<T> done() {
		for(copyMatrix(); isDataIncomplete(); chooseIndexToArrangeData())
			;
		return matrix;
	}
	
	private boolean copyMatrix() {
		return matrixCopy.addAll(matrix) ? (matrix.removeAll(matrix)) : false;
	}
	
	private boolean isDataIncomplete() {
		return matrixCopy.size() != 0;
	}
	
	private void chooseIndexToArrangeData() {
		matrix.add(matrixCopy.remove((int)(Math.random()*matrixCopy.size())));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> testSample = Arrays.asList(new Integer[]{1, 2, 3});
		Shuffle<Integer> test = new Shuffle<Integer>(testSample);
		System.out.println(test.done());
		System.out.println(test.done());
	}

}
