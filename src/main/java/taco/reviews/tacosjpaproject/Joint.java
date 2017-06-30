package taco.reviews.tacosjpaproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Joint {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	private Region region;

	public Region getRegion() {
		return region;
	}

	public void setState(Region region) {
		this.region = region;
	}

	private String name;

	public Long getId() {
		return id;
	}

	public Joint(Region region, String name) {
		this.region = region;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	private Joint() {
	}
}