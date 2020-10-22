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
}
