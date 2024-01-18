//Basic Array input and output
import java.util.Scanner;


class Array_io{

Scanner sc=new Scanner(System.in);

public static void main(String[]args){

Array_io ref= new Array_io();
ref.int_input();
ref.char_input();
ref.string_input();


}

// Method for integer element array
public  void int_input(){

 int a[]=new int[5];
   System.out.println("Enter array element");

     for(int i=0;i<a.length;i++)
       {
          a[i]=sc.nextInt();
       }
      for(int i=0;i<a.length;i++)
        {
          System.out.println("The value at index "+ i + " is " + a[i]);

         }
    }

// Method for character element array
public void char_input(){

char c[]=new char[5];
  System.out.println("Enter array char element");
     
    for(int i=0;i<c.length;i++)
       {
          c[i]=sc.next().charAt(0);
       }
    for(int i=0;i<c.length;i++)
      {
       System.out.println("The character at index "+ i + " is " + c[i]);
       
       }
 }
// Method for string element array
public void string_input(){

String s[]=new String[5];
  System.out.println("Enter array String element");
     
    for(int i=0;i<s.length;i++)
       {
          s[i]=sc.next();
       }
    for(int i=0;i<s.length;i++)
         {
           System.out.println("The String at index "+ i + " is " + s[i]);
         }
}

}

/* Output :=
Enter array element
10
23
56
34
78
The value at index 0 is 10
The value at index 1 is 23
The value at index 2 is 56
The value at index 3 is 34
The value at index 4 is 78
Enter array char element
n
e
h
a
g
The character at index 0 is n
The character at index 1 is e
The character at index 2 is h
The character at index 3 is a
The character at index 4 is g
Enter array String element
hii
Gm
Gn
By
Good 
The String at index 0 is hii
The String at index 1 is Gm
The String at index 2 is Gn
The String at index 3 is By
The String at index 4 is Good


*/










