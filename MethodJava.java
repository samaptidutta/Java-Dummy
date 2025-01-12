class A{
    public void greet(){
        System.out.println("Good Morning!");
    }
    public void arrayPrint(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public int sum(int ... arr){
        int res=0;
        for(int i: arr){
            res+=i;
        }
        return res;
    }
}


public class MethodJava {

    public static int addition(int num1,int num2){
        return num1 + num2;
    }
    public static void main(String[] args) {
        int[] arr={2,5,9,3,6};
        System.out.println(addition(4,5));
        A obj = new A();
        obj.greet();
        obj.arrayPrint(arr);
        System.out.println("variable argument");
        System.out.println(obj.sum());
        System.out.println(obj.sum(1,2,3,4,5));
    }
}
