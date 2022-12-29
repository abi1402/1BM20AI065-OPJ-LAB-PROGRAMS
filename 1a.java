class retailItem
{
   String description;
   int units;
   double price;
   
   public retailItem()
   {}
   public retailItem(String x, int y, double z)
   {
      description=x;
      units=y;
      price=z;
   }
   
   void setDesc(String x)
   {
      description=x;
   }
   
   void setUnits(int y)
   {
      units=y;
   }
   
   void setPrice(double z)
   {
      price=z;
   }
   
   public String getDesc()
   {
      return description;
   }
   
   public int getUnits()
   {
      return units;
   }
   
   public double getPrice()
   {
      return price;
   }
   
}

class lab1a
{
   public static void main(String args[])
   {
      String str="Standard product";
      retailItem r1=new retailItem ("Jacket",12,2500);
      retailItem r2=new retailItem ("Blazer",40,10000);
      retailItem r3=new retailItem();//calling with default pre-set values

      r3.setDesc(str);
      r3.setUnits(100);
      r3.setPrice(10);

      
      System.out.println("\tDescription\tUnits on Hand\tPrice");
   
      System.out.println("Item #1\t"+r1.getDesc()+"\t\t"+r1.getUnits()+" \t\t "+r1.getPrice());
      System.out.println("Item #2\t"+r2.getDesc()+"\t\t"+r2.getUnits()+" \t\t "+r2.getPrice());
      System.out.println("Item #3\t"+r3.getDesc()+"\t\t"+r3.getUnits()+" \t\t "+r3.getPrice());
   }
}
