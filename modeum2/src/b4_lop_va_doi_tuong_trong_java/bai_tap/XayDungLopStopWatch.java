package b4_lop_va_doi_tuong_trong_java.bai_tap;

public class XayDungLopStopWatch {
    private  double starttime;
    private  double endtime;
    public XayDungLopStopWatch(){
        this.starttime=System.currentTimeMillis();
    }
    public void star(){
        this.starttime=System.currentTimeMillis();
    }
    public void end(){
        this.endtime=System.currentTimeMillis();
    }
    public double Elassedtime(){
        return this.endtime-this.starttime;
    }

    public static void main(String[] args) {
        XayDungLopStopWatch operator= new XayDungLopStopWatch();
        int count=0;
        for(int i=0;i<50000;i++){
            count++;
        }
        operator.end();
        System.out.println("thoi gian chenh lech ="+operator.Elassedtime());
    }
}
