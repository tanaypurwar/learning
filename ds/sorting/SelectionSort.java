package ds.sorting;

class SelectionSort{

    public static void main(String [] args) {
        System.out.println("test");
    }

    public static  void sort(int [] arr) {
        int max, temp;
        for(int i=0;i<arr.length;i++){
             max=0;
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[max]){
                    max=j;
                }
            }

            temp =arr[arr.length-i];
            arr[arr.length-i]=arr[max];
            arr[max] = temp;


        }
        
    }
}