
package company;

public class Car {
    
    private String Name ;
    private String Color ;
    private int Speed ;
    private int Price;
    
    public void setData(String name,String color,int speed, int price ){
        this.Name=name;
        this.Color=color;
        this.Speed=speed;
        this.Price=price;
         
     
     
         
     }
    
    public void EQUALS(Car obj1 , Car obj2)
 {
    System.out.println("Comparing Two Cars -> " + obj1.Name+"  VS  "+obj2.Name);
        if (obj1.Name.equals(obj2.Name))
        {
            System.out.println("Same Name");
            System.out.println("---------------------------------------------");
        }
        else
        {
            System.out.println("The Cars With Different Name");
            System.out.println("---------------------------------------------");
        }
        if(obj1.Color.equals(obj2.Color))
        {
            System.out.println("Same Color");
            System.out.println("---------------------------------------------");
        }
        else
        {
            System.out.println("The Cars With Different Color");
            System.out.println("---------------------------------------------");
        }
        if(obj1.Price==obj2.Price)
        {
            System.out.println("Same Price");
            System.out.println("---------------------------------------------");
        }
        else
        {
            System.out.println("The Cars With Different Price");
            System.out.println("---------------------------------------------");
        }
       if(obj1.Speed==obj2.Speed)
        {
            System.out.println("Same Speed");
            System.out.println("---------------------------------------------");    
        }
       else
        {
            System.out.println("the cars with different speed");
            System.out.println("---------------------------------------------");    
        }  
        
 }    
}
    
    

