package package1;

public class package1 {
    
    public int gcd(int x, int y) {
        
        if(y!=0)
        {
            return gcd(y,x%y);
        }

        else
            return x;
}
}
