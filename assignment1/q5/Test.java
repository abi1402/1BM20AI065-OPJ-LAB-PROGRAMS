public class Test {
    public static void main(String[] args) { Circle C=new Circle(5,"Circle1");
        Cube Cu=new Cube(3,"Cube1");
        Cylinder Cy=new Cylinder(7,6,"Cylinder1"); Sphere S=new Sphere(8,"Sphere1"); Square Sq=new Square(6,"Square1"); Glome G=new Glome(9,"Glome1");
        System.out.println(C.getNAME()+" has Radius:"+C.getRADIUS()+", Area:"+C.getArea()); System.out.println(Cu.getNAME()+" has Radius:"+Cu.getSIDE()+", Volume:"+Cu.getVolume());
        System.out.println(Cy.getNAME()+" has Height:"+Cy.getHEIGHT()+", Radius:"+Cy.getRADIUS()+", Volume:"+Cy.getVolume());
        System.out.println(S.getNAME()+" has Radius:"+S.getRADIUS()+", Volume:"+S.getVolume()); System.out.println(Sq.getNAME()+" has Side:"+Sq.getSIDE()+", Area:"+Sq.getArea()); System.out.println(G.getNAME()+" has Radius:"+G.getRADIUS()+", Volume:"+G.getVolume()); }
}
