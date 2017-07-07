package taco.reviews.tacosjpaproject;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class TacoJoint {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String imageURL;
	private String tag;

	@Lob
	private String taste;

	@Lob
	private String review;

	@ManyToOne
	private Region region;

	@ManyToMany
	private Set<Tag> tags;

	public Set<Tag> getTags() {
		return tags;
	}

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

	public String getTag() {
		return tag;
	}

	public void remove(Tag tag) {
		tag.remove(tag);
	}

	public TacoJoint(Region region, Long id, String name, String imageURL, String review, String taste, String tag) {
		this.region = region;
		this.id = id;
		this.name = name;
		this.imageURL = imageURL;
		this.review = review;
		this.taste = taste;
		this.tag = tag;
	}

	public TacoJoint(Region region, String name, String review) {
		this.region = region;
		this.name = name;
		this.review = review;
	}

	public TacoJoint(Region region, String name, Tag... tags) {
		this.tags = new HashSet<>(Arrays.asList(tags));
	}

}