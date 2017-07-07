package taco.reviews.tacosjpaproject;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Region {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String review;

	@OneToMany(mappedBy="region")
	private Set<TacoJoint> tacos;
	
	public Set<TacoJoint> getTacos() {
		return tacos;
	}
	
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getReview() {
		return review;
	}

	public Region(String name) {
		this.name = name;
	}
	
	public Region() {
	}


}