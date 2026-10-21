
public class Exp19_1 {

	public static void main(String[] args) {
		Product product1=new Product(101,"ライブTシャツ",3500);
		
		int unitPrice=product1.getPrice();
		
		System.out.println("3個の合計："+unitPrice*3+"円");
		
		System.out.println(product1.getName()+"："+product1.getPrice()+"円");
		System.out.println();
		
		product1.setPrice(3800);
		System.out.println("現在の価格："+product1.getPrice()+"円");
		System.out.println();
		
		product1.setPrice(-500);
		System.out.println("現在の価格："+product1.getPrice()+"円");
	}

}
