public class Factorial {

  public static void main(String[] args) {
    Factorial f= new Factorial();
    System.out.println("answer is"+f.fact(5));
    System.out.println("answer is"+f.factbyloop(5));
    for(int i=0;i<10;i++)
    {
      f.printName();
    }

    System.out.println("recursion");
    f.printName(10);
  }  

  int factbyloop(int n){
   int retValue =1;
    for(int i=n;i>0;i--){
      System.out.println("value of i "+i);
        retValue= retValue*i;
        

    }
    return retValue;
  }
  
  void printName(){
    System.out.println("rahul");
  }
  void printName(int i){
    if(i<0)
      return;
    System.out.println("rahul");

    printName(--i);
  }
  //recursive function
  int fact(int n){
    if(n==1)//base condition
        return 1;
    return n* fact(n-1);
  }
}