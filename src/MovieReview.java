
public class MovieReview {
	private String title;
	private int rating;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		if(rating>=1&&rating<=5) {
			this.rating=rating;
		}
	}
}
