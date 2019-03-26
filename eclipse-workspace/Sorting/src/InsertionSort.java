import java.util.Scanner;

public class InsertionSort {
	static Scanner in=new Scanner(System.in);
	static public int[] Input() {
		int arr[]= new int[10];
		System.out.println("Enter array : ");
		for(int i=0; i<10; i++) {
			arr[i]=in.nextInt();
		}
		return arr;
	}
	public static int[] Sort(int arr[]) {
		int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
            
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
		return arr;
		
	}
	public static void Output(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=Input();
		arr=Sort(arr);
		Output(arr);
	}

}
