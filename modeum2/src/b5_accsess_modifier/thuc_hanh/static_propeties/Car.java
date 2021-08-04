package b5_accsess_modifier.thuc_hanh.static_propeties;

public class Car {
    private String name;
    private int engine;
    private static int numberofcar;
    public Car() {
    };
    public Car(String name,int ennige){
        this.name=name;
        this.engine=ennige;
        numberofcar++;
    }
    public void Dislay(){
        System.out.println("ten xe "+this.name+"nang luong"+this.engine+" "+this.numberofcar);
    }

    public static void main(String[] args) {
        Car car1=new Car("thanh",20);
        car1.Dislay();
        Car car2=new Car("tu",30);
        car2.Dislay();
    }
}
