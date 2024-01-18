/*
 1: write a program in java to create int an array of size 10 ,take all elements input from user and divide 5th elements with all index value ;

[note:catch exception]

*/

import java.util.Scanner;
class Exception_catch{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int arr[]=new int[10];
System.out.println("Enter the element");
try{
for(int i=0;i<arr.length;i++)
{
 arr[i]=sc.nextInt();
}


for(int i=0;i<arr.length;i++)
  {
     if(arr[i]==arr[5])
    {
       for(int j=0;j<arr.length;j++)
              {

                arr[j]=arr[j]/arr[5];
                System.out.println(arr[j]);
              }
       }
   }

}
catch(ArithmeticException e){
System.out.println("cannot divided by 0");
}

}
  
}        
             

/*

Output :=
Enter the element
2
3
0
7
cannot divided by 0

*/