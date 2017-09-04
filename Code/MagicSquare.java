package com.dharmu;

import java.util.Scanner;

public class MagicSquare 
{
  //rows
  static int rows;
  //colounm
  static int cols;
  //array
  static int[][] array;
  //user number for magic square
  static int val;
  
  public static void main(String[] args) 
  {
     //object of scanner class
     Scanner in=new Scanner(System.in);
     //user value for rows
     System.out.println("Enter any number between 22 to 99:");
     val=in.nextInt();
    //initializing array
    array=new int[4][4];
    val=val-20;
    //initializing cell with some default value
    array[0][0]=val;
    array[1][0]=11;
    array[2][0]=5;
    array[3][0]=4;
    
    array[0][1]=1;
    array[1][1]=8;
    array[2][1]=10;
    array[3][1]=val+1;
    
    array[0][2]=12;
    array[1][2]=val-1;
    array[2][2]=3;
    array[3][2]=6;
    
    array[0][3]=7;
    array[1][3]=2;
    array[2][3]=val+2;
    array[3][3]=9;
    //displaying result
    for(int i=0;i<4;i++)
    {
      for(int j=0;j<4;j++)
      {
        System.out.print(array[i][j]+"\t");
      }
      System.out.println();
    }
    
  }
  
}
