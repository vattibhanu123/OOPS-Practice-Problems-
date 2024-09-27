

class Property{
    private String address;
    private double squarefeets;
    public Property(String address,double squarefeets){
        this.address = address;
        this.squarefeets = squarefeets;
    }
    public String getAddress(){
        return address;
    }
    public double getSquareFeets(){
        return squarefeets;
    }
    public double calculateMarketPrice(){
        return 0;
    }
    public void display(){
        System.out.println("Address: "+address+" Square feets : "+squarefeets);
    }


}
class House extends Property{
    private double pricePerSquareFeet;
    public House(String address,double squarefeets,double pricePerSquareFeet){
        super(address,squarefeets);
        this.pricePerSquareFeet=pricePerSquareFeet;
    }
    public double getPricePerSquareFeet(){
        return pricePerSquareFeet;
    }
    public double calculateMarketPrice(){
        return getPricePerSquareFeet()*getSquareFeets();
    }
    public void display(){
        System.out.println("House  ");
        System.out.println("Address :"+getAddress()+", Square feets :"+getSquareFeets()+", Market value :"+calculateMarketPrice()+"Rupees");
    }
        

}
class Apartment extends Property{
    private double pricePerSquareFeet;
    public Apartment(String address,double squarefeets,double pricePerSquareFeet){
        super(address,squarefeets);
        this.pricePerSquareFeet=pricePerSquareFeet;
    }
    public double getPricePerSquareFeet(){
        return pricePerSquareFeet;
    }
    public double calculateMarketPrice(){
        return getPricePerSquareFeet()*getSquareFeets();
    }
    public void display(){
        System.out.println("Apartment  ");
        
        System.out.println("Address :"+getAddress()+", Square feets :"+getSquareFeets()+", Market value :"+calculateMarketPrice()+"Rupees");
    }
       

}
class Commercial extends Property{
    private double pricePerSquareFeet;
    public Commercial(String address,double squarefeets,double pricePerSquareFeet){
        super(address,squarefeets);
        this.pricePerSquareFeet=pricePerSquareFeet;
    }
    public double getPricePerSquareFeet(){
        return pricePerSquareFeet;
    }
    public double calculateMarketPrice(){
        return getPricePerSquareFeet()*getSquareFeets();
    }
    public void display(){
        System.out.println("Commercial  ");
        System.out.println("Address :"+getAddress()+", Square feets :"+getSquareFeets()+", Market value :"+calculateMarketPrice()+"Rupees");
    }
       

}
public class RealEstateManagement{
    public static void main(String args[])
    { 
       House h1=new House("MaruthiNagar",5.5,5000);
       h1.display();
       System.out.println("------------------------------------------------");
       Apartment a1=new Apartment("KalyanNagar",10.5,6000);
       a1.display();
       System.out.println("------------------------------------------------");
       Commercial c1=new Commercial("Uppal",20.5,7000);
       c1.display();


    }

}
