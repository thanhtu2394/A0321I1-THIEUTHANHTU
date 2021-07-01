package b3_array_or_method.baitap;

public class GopMang {


    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8,9};
        int[] arr1={12,123,54,3,5,57,43,645,324};
        int[] arr2=new int[(arr.length+arr1.length)];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }
        for(int i=0;i<arr1.length;i++){
            arr2[(arr.length+i)]=arr1[i];
        }
        System.out.print("cac phan tu cua mang sau khi gom :");
        for(int i:arr2){
            System.out.print(i);
        }
    }
}
