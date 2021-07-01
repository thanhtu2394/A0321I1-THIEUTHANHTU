package b3_array_or_method.thuchanh;

public class TimGiaTrintPhuongThuc {
    public int giaTriNhoNhat(int[] array) {
        int min=array[0];
        int index=0;
        for(int i=1;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
                index=i;
            }

        }
        return index;


    }

    public static void main(String[] args) {
        int[] arr={4,5,7,6,3,2,1};
        TimGiaTrintPhuongThuc a=new TimGiaTrintPhuongThuc();
        int b=a.giaTriNhoNhat(arr);
        System.out.println("vi tri gia tri nho nhat trong mang "+b);
        System.out.println("gia tri nho nhat "+arr[b]);
    }

}
