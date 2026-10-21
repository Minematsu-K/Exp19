
public class Main {

	public static void main(String[] args) {
		Player player=new Player();
		MovieReview review =new MovieReview();
		
		player.setName("カイ");
		player.setLevel(15);
		
		System.out.println(player.getName()+" レベル："+player.getLevel());
		System.out.println();
		
		review.setTitle("星空の冒険");
		review.setRating(4);
		
		System.out.println(review.getTitle()+" 評価："+review.getRating());
	}

}
