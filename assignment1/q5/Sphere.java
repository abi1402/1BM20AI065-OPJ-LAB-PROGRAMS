public class Sphere extends Circle implements Volume {
    public Sphere(double r, String n) { super(r, n);
    }
    @Override
    public double getVolume() {
        return(4/3*super.getArea()*super.getRADIUS()); }
}
