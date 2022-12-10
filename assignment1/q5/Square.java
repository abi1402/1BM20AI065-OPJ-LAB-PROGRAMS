public class Square extends Shape implements Area { private double SIDE;
    public Square(double side,String n) { super(n);
        this.SIDE = side;
    }
    public double getSIDE() { return SIDE;
    }
    @Override
    public double getArea() {
        return(this.getSIDE()*this.getSIDE()); }
}
