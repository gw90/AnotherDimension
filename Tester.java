public class Tester {
    public static void main(String[] args){
	int[] a = {1,3,2,1};
	int[][] b = {{1,1,1},{2,4,2},{3,-1,-1}};
	System.out.println(ArrayOps.largest(a));
	System.out.println(ArrayOps.sumRows(b));
	System.out.println(ArrayOps.sumRows(b));
	System.out.println(ArrayOps.largestInRows(b)[1]);
	System.out.println(ArrayOps.sum(b));
	System.out.println("--");
	for(int i = 0; i<ArrayOps.sumCols(b).length; i++){
	    System.out.println((ArrayOps.sumCols(b)[i]));
	}
    }
}
