public abstract class Animal {
    protect int legs;
    protected Animal (int legs) {
        this.legs = legs;
    }
    public abstract void eat ();
    public void walk () {
        System.ou.println("This animal walks on " + legs + "legs.");
    }

    //more code
}
