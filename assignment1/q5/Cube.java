public class Cube extends Square implements Volume {
    public Cube(double s, String n) { super(s, n);
    }
    @Override
    public double getVolume() {
        return(super.getSIDE()*super.getSIDE()*super.getSIDE()); }
}
