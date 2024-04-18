package arrayDemo;

public class Array_Demo {
	int arr[]= {4,45,67};
	int[] printarr(int arr[]) {
		for(int k:arr)
			System.out.println(k);
		return new int[] {1,2,3,4};
	}
public static void main(String[] args) {
	Array_Demo ad= new Array_Demo();
	ad.printarr(ad.arr);
}
}