public class ArrayOps {
    public static int sum(int[] arr) {
	int c = 0;
	for(int i = 0; i<arr.length; i++) c+=arr[i];
	return c;
    }
    public static int largest(int[]arr) {
	int l = 0;
	for(int i = 0; i<arr.length; i++) if(arr[i]>l) l=arr[i];
	return l;
    }
    public static int[] sumRows(int[][] matrix) {
	int[] out = new int[matrix.length];
	for(int i = 0; i<matrix.length; i++) out[i]=sum(matrix[i]);
	return out;
    }
    public static  int[] largestInRows(int[][] matrix){
	int[] out = new int[matrix.length];
	for(int i = 0; i<matrix.length; i++) out[i]=largest(matrix[i]);
	return out;
    }
    public static int sum(int[][] arr) {
	return sum(sumRows(arr));
    }
    public static int[] sumCols(int[][] matrix) {
	int[] out = new int[matrix[0].length];
	for(int j = 0; j<matrix.length; j++){
	    for(int i = 0; i<matrix[0].length; i++){
		out[i]+=matrix[j][i];
	    }
	}
	return out;
    }
    public static boolean isRowMagic(int[][] matrix) {
	for(int i = 0; i<matrix.length-1; i++){
	    if(sum(matrix[i])!=sum(matrix[i+1])) return false;
	}
	return true;
    }
    public static boolean isColMagic(int[][] matrix) {
	int[] inter = sumCols(matrix);
	for(int i = 0; i<inter.length-1; i++){
	    if(inter[i]!=inter[i+1]) return false;
	}
	return true;
    }
    public static boolean isLocationMagic(int[][] matrix, int row, int col) {
	return sumCols(matrix)[col]==sumRows(matrix)[row];
    }
}
