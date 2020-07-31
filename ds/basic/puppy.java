public class Puppy {
    int age;
    String name;
    static LEG_COUNT=4;
   public Puppy(String name) {
      // This constructor has one parameter, name.
      System.out.println("Passed Name is :" + name );
   }
   
   int getAge(){
    return age;
   }

   public static void main(String []args) {
      // Following statement would create an object myPuppy
      Puppy myPuppy = new Puppy( "tommy" );
     
       
   }
}