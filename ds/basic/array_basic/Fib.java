public class Fib {

  public static void main(String[] args) {
    Fib f= new Fib();
    for(int i=0;i<10;i++){
      System.out.println(f.fibc(i));
    }
  
  
}
int fibc(int n){
  //System.out.println("value of n is " +n);
  if(n==0 )
    return 0;
  if(n==1 ||n==2)
    return 1;
  return fibc(n-1) +fibc(n-2);
}

}