/*create an enum called size for size of pizza: XS, S,M,L
create a class called test which has an instance of size,
and it's constructor 
method called OrderPizza having a switch statement having case labels of enum,
a driver class for main method which creates an instance of test and orders pizza
*/
enum size
 {
 XS, S,M, L;
 } 
 class test
 {

 size pizzsize;
 
 public test(size pizzsize)
 {
 this.pizzsize=pizzsize;
 } 
 void OrderPizza()
 {
 switch(pizzsize)
 {
  case XS:
  System.out.println("XS");
  break;
   case S:
  System.out.println("S");
  break;
   case M:
  System.out.println("M");
  break;
   case L:
  System.out.println("L");
  break;
  
  default: System.out.println("Yo");
  
}}} 
class pizza
{
public static void main(String args[])
{
 size s = size.S;
 test t=new test(s);
 t.OrderPizza();
 }}
