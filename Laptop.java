public class Laptop{
  private String brand;
  private Double price;

  public Laptop(String brand,  Double price){
		this.brand = brand;
		this.price = price;
		System.out.println("This is parameterise Constructor");
	}
 public Laptop(){
	System.out.println("This is default Constructor");
	}
 public static void main(String[] args){
	Laptop l1 = new Laptop();
	Laptop l2 = new Laptop("hp", 500000.00);
		
	}

}