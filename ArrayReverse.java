package com.aayush.gulia;

public class ArrayReverse {

    public static void main(String[] args) {
    	/*
    	reversing array using auxiliary array
    	 */
		int[] x = new int[10];
		x[0]=1;
		x[1]=2;
		x[2]=3;
		x[3]=4;
		x[4]=5;
		x[5]=6;
		int length = 6;
		Reverse(x,length);
		Display(x,length);
	}
	static void Reverse(int[] arr, int length){
    	int[] tempArray = new int[10];
    	for(int i=length-1, j=0; i>=0;i--,j++){    //---> (n)
    		tempArray[j]= arr[i];
		}
		for(int i=0;i<length;i++){  //manual array copy //---> (n)
			arr[i]=tempArray[i];
		}
	}
	static void Display(int[] array, int lengthOfArray){
    	for(int i=0;i<lengthOfArray;i++){  // ---> (n)
			System.out.println(array[i] + " index: " + i);
		}
	}
}
