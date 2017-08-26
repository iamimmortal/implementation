package com.dharmu;

import java.util.Scanner;

public class UthopianTree 
{
  
  //for number of Test cases
  static int T;
  //for number of growth cycle
  static int N;
  //for height of tree
  static int H=1;
  public static void main(String[] args) 
  {
    //object of Scanner class
    Scanner in=new Scanner(System.in);
       System.out.println("Enter number of test cases:");
       T=in.nextInt();
       while(T>0)
       {
         T--;
         System.out.println("Enter no of cycles:");
         N=in.nextInt();
         System.out.println(growth(N));
       }
  }
  //tree growth count method
  public static int growth(int N)
  {
     if(N==0)
     {
        return 1;
     }
     else if(N==1)
     {
       return 2;
     }
     else
     {
       for(int i=1;i<=N;i++)
       {
         if(i%2!=0)
         {
           H=H*2;
         }
         else
         {
           H++;
         }
       }
       return H;
     }
  }
}
