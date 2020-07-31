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
    private  int varDemo(){
        int range;
        range =10;
        System.out.println(range);
        return range+10;
        
    }
    
    public static class Puppy {
        public String  name; 
    }
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
       
       
       
        for(int i=0;i<ageArray.length;i++ ){
           if(ageArray[i] ==50 )
           {//comparision 
                System.out.println("value 50 at " + i);
           }
       }
       
    }
}