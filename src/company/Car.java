
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
    public void EQUALS(Car obj1,Car obj2){
        System.out.println("comparing two cars   : "+obj1.Name+"  vs  "+obj2.Name);
        System.out.println("");
         if(obj1.Name.equals(obj2.Name)){
         
             System.out.println("same name");
             System.out.println("********************************************");    
         }else
         {
                 System.out.println("the cars with different name");
    
            System.out.println("********************************************");    
         }
         if(obj1.Color.equals(obj2.Color)){
         
             System.out.println("same color");
            System.out.println("********************************************");    
         }else
         {
                 System.out.println("the cars with different colors");
       System.out.println("********************************************");    
         }
       if(obj1.Speed==obj2.Speed){
         
             System.out.println("same speed");
            System.out.println("********************************************");    
   }else
         {
                 System.out.println("the cars with different speed");
       System.out.println("********************************************");    
         }  
       if(obj1.Price==obj2.Price){
         
             System.out.println("same price");
          System.out.println("********************************************");      
       }else
         {
                 System.out.println("the cars with different price");
       System.out.println("********************************************");    }
       
    }

}
    
    

