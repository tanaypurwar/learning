import java.util.Arrays;

class ArrayExamples {

    public static int deleteAtIndex(int [] testArry,int index) {
        int length=0;
        if(index<0 || index>testArry.length-1){
        System.out.println("invalid index" + index);
        }

            for(int i=index;i<testArry.length-1;i++){
                testArry[i]=testArry[i+1];
            }
        
        System.out.println("Array after deletion "+ Arrays.toString(testArry));
        return length-1;
    
    }

    public static int insertAtIndex(int [] arr,int n,int val) {
      int length= arr.length;
        for(int i=arr.length-1;i>=n;i--){
            if(i!=0)
            arr[i]=arr[i-1];
        }
        arr[n]=val;
        System.out.println("Array after deletion "+ Arrays.toString(arr));
        return arr.length ==length?length:length+1;
    }
    
    
     public static void main(String[] args) {
       int [] testArry = new int[] {1,2,3,4,5};
      // ArrayExamples.deleteAtIndex(testArry,4);
       ArrayExamples.insertAtIndex(testArry, 1, 99);
    }
}
