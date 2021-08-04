package b5_accsess_modifier.thuc_hanh.static_method;

public class Check {
    public static void main(String[] args) {
//        StacticMethod.colecge="no";
        StacticMethod.chane();
        StacticMethod stutent=new StacticMethod("tu",18);
        StacticMethod stutent1=new StacticMethod("tuan",18);
        StacticMethod stutent2=new StacticMethod("tung",18);
        stutent.dislay();
        stutent1.dislay();
        stutent2.dislay();
    }
}
