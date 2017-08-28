package com.dharmu;

import java.util.Scanner;

public class AngryProfessor 
{
  /*Total test cases*/
   static int T;
   /*Cancellation threshhold*/
   static int K;
   /*Number of student*/
   static int N;
   /*array to store arrival time of student*/
   static int[] array;
   /*counter*/
   static int count;
   
  public static void main(String[] args) 
  {
     /*Scanner class object*/
      Scanner sc=new Scanner(System.in);
      //System.out.println("Enter test cases:");
      T=sc.nextInt();
      /*constraint checking*/
      //for T
     if(T<=0||T>10)
     {
       sc.close();
       return;
     }
     //loop for test cases
    for(int i=1;i<=T;i++)
    {
      System.out.println("Enter no of student:");
      N=sc.nextInt();
      System.out.println("Enter threshold value:");
      K=sc.nextInt();
      /*constraint checking*/
     //for N
     if(N<=0||N>1000)
     {
       sc.close();
       return ;
     }
     //for K
     if(K<=0||K>N)
     {
       sc.close();
       return;
     }
     //loop for taking arrival time of student
     //initializing array
     array=new int[N];
     /*initializing counter to 0*/
     count=0;
     for(int j=0;j<N;j++)
     {
        System.out.println("Enter value:");
        array[j]=sc.nextInt();
        /*constraint checking for arrival time*/
        if(array[j]<(-100)||array[j]>100)
        {
          sc.close();
          return;
        }
        //counting for K check
        if(array[j]<=0)
        {
          count++;
        }
     }
     //check counter for K
     if(count<K)
     {
       System.out.println("YES");
     }
     else
     {
       System.out.println("NO");
     }
   }
 }
}
