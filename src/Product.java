
public class Product {
	
	private int productId; 
    private String name; 
    private int price; 

    public Product(int productId, String name, int price) { 
        this.productId = productId; 
        this.name = name; 
        this.price = price; 
    } 
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		if(price>=1&&price<=100000) {
			this.price=price;
		}else {
			System.out.println("価格を変更できませんでした");
		}
	}
	
	public String getName() {
		return this.name;
	}
}
