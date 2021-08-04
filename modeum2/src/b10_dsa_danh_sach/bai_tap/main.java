package b10_dsa_danh_sach.bai_tap;

public class main {
    public static void main(String[] args) {
        MyListbt<Integer> list=new MyListbt<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(23,2);
        list.remove(3);
        list.remove(5);
        System.out.println(list.get(4));
        list.clear();

        System.out.println(list.size());
    }
}
