public class Cylinder extends Circle implements Volume { private double HEIGHT;
    public Cylinder(double height, double r, String n) { super(r, n);
        this.HEIGHT = height;
    }
    public double getHEIGHT() { return HEIGHT;
    }
    public double getVolume() { return(super.getArea()*this.HEIGHT); }
}
