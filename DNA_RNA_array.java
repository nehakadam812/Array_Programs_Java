//Find DNA and RNA 

import java.util.Scanner;

class DNA_RNA_array{

Scanner sc=new Scanner(System.in);

public static void main(String[]args){

DNA_RNA_array ref=new DNA_RNA_array();
ref.dna_rna();

}

public void dna_rna(){
String str[]={"0001101010001","11111101010001",
"0001101010001","1111101010001"};
int dna_count=0;
int rna_count=0;

for(int i=0;i<str.length;i++)//Outer loop array
    {
    
      String concat="";
       
       for(int j=0;j<3;j++) //Inner loop for string
           {
            if(str[i].charAt(j)=='0' || str[i].charAt(j)=='1')
              {
                concat=concat+str[i].charAt(j);
              }
            }
     if(concat.equals("000"))
          {
            dna_count++;
          }
      else if(concat.equals("111"))
          {
             rna_count++;
          }
       else
          {
            System.out.println("Not valid"); 
          }
    

}
System.out.println("The DNA in array is " + dna_count);
System.out.println("The RNA in array is " + rna_count);

}
}


/*   Output := 
                The DNA in array is 2
                The RNA in array is 2
*/










