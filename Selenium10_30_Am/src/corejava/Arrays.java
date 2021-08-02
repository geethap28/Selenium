package corejava;


public class Arrays {

	public static void main(String[] args) {

		int[] arr= {19,34,56};
		int[] arr1= {12,56,78,96,24};
		int[] arr2= {19,34,57};
		
	//length of array
		System.out.println(arr.length);
		System.out.println(arr1.length);
	
	//Displaying Array
	for (int i = 0; i < arr.length; i++) {
		System.out.println("List Of Array is : "+ arr[i]);
	}	
	
	
	//For loop array
	for(int element: arr1) {
	System.out.println(element);
	
	}
	
	//Total Array
	int sum = 0;
	for (int i = 0; i < arr2.length; i++) {
		sum +=arr2[i];
	}
		System.out.println("Total Array is :" + sum);
		
		
		//Finding Max Array
		
		int max = arr1[0];
		for (int j = 0; j < arr1.length; j++) {
		if (arr1[j] > max) max=arr1[j]; {
		}
		System.out.println("Max Array is :" + max);
		}
	}

		}

	


