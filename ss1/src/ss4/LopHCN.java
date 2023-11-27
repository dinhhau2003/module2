package ss4;

public class LopHCN {
    double width,height;
    public LopHCN(){
    }
    public LopHCN(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double getArea(){
        return this.height*this.width;
    }
    public double getPerimeter(){
        return (this.width+this.height);
    }
}
