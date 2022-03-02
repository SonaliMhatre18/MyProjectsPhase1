package com.array.demo;

public class ArrayAssisted {

public static void main(String[] args) {

//single-dimensional array
int a[]= {42,21,94,86,57};
for(int i=0;i<5;i++) {
System.out.println("Elements of array a: "+a[i]);
}


//multidimensional array
int[][] b = {
            {2, 4, 9, 5}, 
            {3, 1, 7} };
      
      System.out.println("\nLength of row 1: " + b[0].length);
     //System.out.println("\nLength of row 2: " + b[1].length);
      }
}
