public class array {
    public static void main(String[] args) {
        int[] arr=new int[6];
        arr[0]=12;
        arr[1]=13;
        arr[2]=14;
        arr[3]=15;
        arr[4]=16;
        arr[5]=17;
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println(arr.length);

        int[][] mat=new int[2][2];
        mat[0][0]=12;
        mat[0][1]=13;
        mat[1][0]=14;
        mat[1][1]=15;
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.err.println();
        }
    }
}
