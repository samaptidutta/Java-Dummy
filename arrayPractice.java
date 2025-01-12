public class arrayPractice {
    public static void main(String[] args) {
        int[] arr = {1,5,3,7,88};
        int ele=88;
        boolean flag=false;
        for(int i: arr){
            if(i==ele){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("element is present in the array");
        }
        else{
            System.out.println("Element is not present in the array");
        }

        boolean f= true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                f=false;
                break;
            }
        }
        if(f){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("Is not sorted");
        }
    }
}
