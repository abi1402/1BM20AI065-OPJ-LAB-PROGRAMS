public class Circle extends Shape implements Area{
    private double RADIUS;
    public Circle(double r,String n){ super(n);
        this.RADIUS=r;
    }
    public double getRADIUS() { return RADIUS;
    }
    @Override
    public double getArea() {
        return(Math.PI*this.RADIUS*this.RADIUS); }
}
