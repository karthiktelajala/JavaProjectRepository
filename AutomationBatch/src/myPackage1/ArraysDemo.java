package myPackage1;

import javax.xml.ws.Dispatch;

public class ArraysDemo {

	public static void main(String[] args) {
		
		//1. Single Dimensional Array:
		
		int[] i = new int[5];
		i[2]= 5;
		i[4]=12;
		//or 
		int[] k = {4,1,5,9,12};
		
		//System.out.println(a.length);
		
		//printing particular element of an array
//		System.out.println(a[4]);
		//printing all the array elements
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]); // 0,0,5,0,12
//		}
		
		displaySingleDimensionalArray(i);
		
		displaySingleDimensionalArray(k);
		//2. Multi Dimensional Array:
		int[][] a = new int[3][4];
		int[][] b = {{3,7,1},{4,7,1},{7,4,2},{4,5,9}};
		
		a[0][1] = 1;
		a[0][2]=9;
		a[1][0] = 3;
		a[1][2] = 7;
		a[2][1] = 4;
		a[2][2] =2;
		
		//System.out.println(a[2][1]);
		
		System.out.println("===========Printin 3X4 matrix===========");
		displayTwoDimensionalArray(a);
		System.out.println("===========Printin 4X3 matrix===========");
		displayTwoDimensionalArray(b);
	}	
	
	
	public static void displayTwoDimensionalArray(int[][] twoArray)
	{
		for (int i = 0; i < twoArray.length; i++) 
		{
			for (int j = 0; j < twoArray[i].length; j++) {
				System.out.print(twoArray[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void displaySingleDimensionalArray(int[] array)
	{
		for (int i = 0; i < array.length; i++) 
		{
				System.out.print(array[i]+" ");		
		}
		System.out.println();
	}
}
