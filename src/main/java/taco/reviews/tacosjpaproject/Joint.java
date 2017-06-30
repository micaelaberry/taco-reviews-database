package taco.reviews.tacosjpaproject;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Joint {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
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
	
	public String getName() {
		return name;
	}

	public Joint(Region region, String name) {
		this.region = region;
		this.name = name;
	}


	private Joint() {
	}
	
}