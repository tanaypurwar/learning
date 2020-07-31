/*
variables
int 
long 
double
String
char
variable type
array

*/
public class Solution {
    
    public static void main(String[] args){
        int age =10; //variable define and initialize
       int [] ageArray = new int[5]; //array define
       ageArray[0] =20;//assignment
       ageArray[1] =30;
       ageArray[2] =40;
       ageArray[3] =50;
       ageArray[4] =60;
       for(int i=0;i<ageArray.length;i++ ){//for loop
           System.out.println("value at index " + i +"  "+ ageArray[i]);
       }
       
       System.out.println("backword ");
       for(int i=ageArray.length-1;i>=0;i-- ){//for loop
           System.out.println("value at index " + i +"  "+ ageArray[i]);
       }
       
       
    }
}