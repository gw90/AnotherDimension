import java.util.Arrays;

public class Tester {
    public static void main(String[] args){
	int[] a = {1,3,2,1};
	int[][] b = {{1,1,1},{2,2,2},{3,2,3}};
	int[][] E = {{2,4,2},{2,2,2}}; 
	System.out.println(ArrayOps.largest(a));
	System.out.println(ArrayOps.sumRows(b));
	System.out.println(ArrayOps.sumRows(b));
	System.out.println(ArrayOps.largestInRows(b)[1]);
	System.out.println(ArrayOps.sum(b));
	int[][]  A = { {  1,  0, 12, -1 },
                  {  7, -2,  2,  1 },
                  { -5, -2,  2, -9 }
               };
	System.out.println("--");
	System.out.println(Arrays.toString(ArrayOps.sumCols(A)));
	System.out.println("--");
	for(int i = 0; i<ArrayOps.sumCols(E).length; i++){
	    System.out.println((ArrayOps.sumCols(E)[i]));
	}
	System.out.println(ArrayOps.isLocationMagic(E, 0, 1));
	System.out.println(ArrayOps.isLocationMagic(E, 1, 1));
    }
}
