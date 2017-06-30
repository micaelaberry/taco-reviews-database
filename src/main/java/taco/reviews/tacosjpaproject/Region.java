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

	@OneToMany(mappedBy="region")
	private Set<Joint> joint;
	
	public Set<Joint> getJoints() {
		return joint;
	}

	public void setCities(Set<Joint> joint) {
		this.joint = joint;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Region(String name) {
		this.name = name;
	}

	public Region() {
	}

}