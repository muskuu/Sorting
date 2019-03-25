import java.util.Scanner;

public class BubbleSort {
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
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int Temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=Temp;
				}
			}
		}
		return arr;
		
	}
	public static void Output(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");}
		}
	public static void main(String[] args) {
		int arr[]=Input();
		arr=Sort(arr);
		Output(arr);
		
		
	}

}
