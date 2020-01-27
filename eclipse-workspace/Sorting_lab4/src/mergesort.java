import java.util.Arrays; 
public class mergesort {
public static void mergeSort(int[] array) 
		    { 
		        if(array == null) 
		        { 
		            return; 
		        } 
		  
		        if(array.length > 1) 
		        { 
		            int mid = array.length / 2; 
		  
		            int[] left = new int[mid]; 
		            for(int i = 0; i < mid; i++) 
		            { 
		                left[i] = array[i]; 
		            } 
		              
		
		            int[] right = new int[array.length - mid]; 
		            for(int i = mid; i < array.length; i++) 
		            { 
		                right[i - mid] = array[i]; 
		            } 
		            mergeSort(left); 
		            mergeSort(right); 
		  
		            int i = 0; 
		            int j = 0; 
		            int k = 0; 
		  
		            while(i < left.length && j < right.length) 
		            { 
		                if(left[i] < right[j]) 
		                { 
		                    array[k] = left[i]; 
		                    i++; 
		                } 
		                else
		                { 
		                    array[k] = right[j]; 
		                    j++; 
		                } 
		                k++; 
		            } 
		            
		            while(i < left.length) 
		            { 
		                array[k] = left[i]; 
		                i++; 
		                k++; 
		            } 
		            while(j < right.length) 
		            { 
		                array[k] = right[j]; 
		                j++; 
		                k++; 
		            } 
		        } 
		    } 
		    public static void main(String[] args) 
		    { 
		        int arr[] = {16,6,28,12,6}; 
		        int i=0; 
		        System.out.println("Given array is"); 
		  
		        for(i=0; i<arr.length; i++) 
		            System.out.print(arr[i]+" "); 
		  
		        mergeSort(arr); 
		  
		        System.out.println("\n"); 
		        System.out.println("Sorted array is"); 
		  
		        for(i=0; i<arr.length; i++) 
		            System.out.print(arr[i]+" "); 
		    } 
		} 
	

