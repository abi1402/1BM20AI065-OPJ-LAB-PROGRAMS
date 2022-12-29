class Car{
private int model;
private String make;
private int speed;
Car(int x, String y, int z){
this.model=x;
this.make=y;
this.speed=z;
}
void display(){
System.out.println("model="+model);
System.out.println("make="+make);
System.out.println("speed="+speed);
}
int accelerate(){
speed=speed+5;
return speed;
}
int brake(){
speed=speed-5;
return speed;
}
}
class one_b{
public static void main(String args[]){
Car c = new Car(1998,"Audi",100);
c.display();
int temp;
temp = c.accelerate();
System.out.println("New speed="+temp);
temp = c.accelerate();
System.out.println("New speed="+temp);
temp = c.accelerate();
System.out.println("New speed="+temp);
temp = c.accelerate();
System.out.println("New speed="+temp);
temp = c.accelerate();
System.out.println("New speed="+temp);
temp = c.brake();
System.out.println("New speed="+temp);
temp = c.brake();
System.out.println("New speed="+temp);
temp = c.brake();
System.out.println("New speed="+temp);
temp = c.brake();
System.out.println("New speed="+temp);
temp = c.brake();
System.out.println("New speed="+temp);
}
}
