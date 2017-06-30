package taco.reviews.tacosjpaproject;

public class Taco {
	//right click- click source- go to 'Generate Getters and Setters'

	private long id; // should be long
	private String title;
	private String taste;
	private String imageURL;
	public String description;

	public long getId() { // id
		return id;
	}

	public String getTitle() { // name of the taco place
		return title;
	}

	public String getImageURL() { // get taco pic
		return imageURL;
	}

	public String getTaste() { // taste level of food
		return taste;
	}

	public String getDescription() { // get taco review
		return description;
	}

	public Taco(Joint condado, String title, String imageURL, String taste, String description) {
		this.title = title;
		this.imageURL = imageURL;
		this.taste = taste;
		this.description = description;

	}
	

}