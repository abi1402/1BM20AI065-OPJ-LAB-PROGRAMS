import square.*;
import cube.*;
import java.lang.Math;

abstract class Nums
{
    int number;
    abstract void random();
}

public class sqaure_cube extends Nums{
    void random()
    {
        int max = 100,min=1;
        number = (int)(Math.random()*(max-min+1)+min);
    }
    public static void main(String[] args)
    {
        square ob1 = new square();
        cube ob2 = new cube();
        sqaure_cube ob3 = new sqaure_cube();

       for(int i=1;i<=10;i++)
       {
            ob3.random();

            int sq = ob1.find_square(ob3.number);
            int cu = ob2.find_cube(ob3.number);

            System.out.println("square: "+sq);
            System.out.println("cube: "+cu);
       }
        
    }
}
