package taco.reviews.tacosjpaproject;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class TacoJoint {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String imageURL;
	
	@Lob
	private String taste;

	@Lob
	private String review;

	@ManyToOne
	private Region region;

	public Region getRegion() {
		return region;
	}

	public void setRegions(Region region) {
		this.region = region;
	}

	public Long getId() {
		return id;
	}

	public String getImageURL() {
		return imageURL;
	}

	public String getTaste() {
		return taste;
	}

	public String getReview() {
		return review;
	}

	public String getName() {
		return name;
	}

	private TacoJoint() {
	}

	public TacoJoint(Region region, Long id, String name, String imageURL, String review, String taste) {
		this.region = region;
		this.id = id;
		this.name = name;
		this.imageURL = imageURL;
		this.review = review;
		this.taste = taste;
	}


}