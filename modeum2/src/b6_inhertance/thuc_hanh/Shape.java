package b6_inhertance.thuc_hanh;

public class Shape {
    private String color;
    private boolean filler;
    public Shape(){
        this.color="green";
        this.filler=true;
    };
    public Shape(String color,Boolean filler){
        this.color=color;
        this.filler=filler;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiller() {
        return filler;
    }

    public void setFiller(boolean filler) {
        this.filler = filler;
    }
    public void hienthi(){
        System.out.println("asadsa");
    }

    @Override
    public String toString() {
        if(filler){
            return  "A Shape with color of "+this.getColor()+" and  filled";
        }else{
            return  "A Shape with color of "+this.getColor()+" and  not filled";
        }
    }
}
