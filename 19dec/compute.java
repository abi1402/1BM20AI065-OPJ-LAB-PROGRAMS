import package1.*;
import package2.*;

public class compute {
    public static void main(String[] args)
    {
        package1 ob1 = new package1();
        package2 ob2 = new package2();

        int gcd = ob1.gcd(40,60);
        int lcm = ob2.lcm(5,6);

        System.out.println("GCD is "+gcd);
        System.out.println("LCM is "+lcm);
    }
}
