package b5_accsess_modifier.thuc_hanh.static_method;

public class StacticMethod {
    private String name;
    private int age;
    private static String colecge="hello";
    public StacticMethod(){};
    public StacticMethod(String name,int age){
        this.name=name;
        this.age=age;
    }
    public static void chane(){
        colecge="ok";
    }
    public void dislay(){
        System.out.println("ten :"+this.name+"tuoi"+this.age+"??"+this.colecge);
    }

    public static void main(String[] args) {
        StacticMethod.colecge="no";
//        StacticMethod.chane();
        StacticMethod stutent=new StacticMethod("tu",18);
        StacticMethod stutent1=new StacticMethod("tuan",18);
        StacticMethod stutent2=new StacticMethod("tung",18);
        stutent.dislay();
        stutent1.dislay();
        stutent2.dislay();
    }
}
