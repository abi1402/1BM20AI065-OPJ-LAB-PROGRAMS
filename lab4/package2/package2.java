package package2;

public class package2
{
    int gcd,lcm;
    public int lcm(int num1, int num2)
    {   
        for ( int i = 1; i <= num1 && i <= num2; ++i)  
        {  
            // check whether i id divisible by both positive number num1 and num2.  
            if  (num1 % i ==0 && num2 % i == 0)  
            gcd = i; // assign the divisible number i to gcd          
        }  
        lcm = (num1 * num2) / gcd;  
        return lcm;

    }
}
