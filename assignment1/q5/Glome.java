public class Glome extends Sphere implements Volume{
    public Glome(double r, String n) { super(r, n);
    }
    @Override
    public double getVolume(){
        return(0.5*super.getArea()*super.getArea()); }
}
