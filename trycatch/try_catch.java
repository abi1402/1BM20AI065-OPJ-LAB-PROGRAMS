import java.util.*;

// class calc
// {
//     double add(double a, double b)
//     {
//         return(a+b);
//     }

//     double subs(double a, double b)
//     {
//         return(a-b);
//     }

//     double multi(double a, double b)
//     {
//         return(a*b);
//     }

//     double divi(double a, double b)
//     {
//         return(a/b);
//     }
// }



public class try_catch 
{
    double add(double a, double b)
        {
            return(a+b);
        }
        double subs(double a, double b)
        {
            return(a-b);
        }
        double multi(double a, double b)
        {
            return(a*b);
        }
        double divi(double a, double b)
        {
            return(a/b);
        }

    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);

        
        try_catch ob = new try_catch();
        System.out.println("Enter your choice of arithmetic operation :");
        System.out.println("1 for addition");
        System.out.println("2 for substraction");
        System.out.println("3 for multiplication");
        System.out.println("4 for division");

        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                try
                {
                    double ans = ob.add(5,6);
                    System.out.println(ans);
                }

                catch(Exception e)
                {
                    System.out.println("Not valid");
                }

                break;
            

            case 2:
                try
                {
                    

                    double ans = ob.subs(5,6);
                    System.out.println(ans);
                }

                catch(Exception e)
                {
                    System.out.println("Not valid");
                }

                break;

            case 3:
                try
                {
                    // ob.multi(5,6);

                    double ans = ob.multi(5,6);
                    System.out.println(ans);
                }

                catch(Exception e)
                {
                    System.out.println("Not valid");
                }

                break;

            case 4:
                try
                {
                    // ob.add(5,6);

                    double ans = ob.divi(5,6);
                    System.out.println(ans);
                }

                catch(Exception e)
                {
                    System.out.println("Not valid");
                }

                break;

            default :
                System.out.println("Not valid choice");

                
        }


    }
}
