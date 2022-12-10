public class TestAnimals {
    public static void main(String[] args) {
        Fish f = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Aminal e = new Cat ();

        //Demostrate different implementations of an interface
        f.play();
        c.play();

        //Demostrate virtual method invocation
        e.eat();
        e.walk();

        //Demostrate calling super methods
        a.walk();
    }
}
