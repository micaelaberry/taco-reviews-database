package taco.reviews.tacosjpaproject;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OrderBy;

@Entity
public class Tag {

	@Id
	@GeneratedValue
	private Long tagId;
	
	private String name;
	
	@ManyToMany(mappedBy= "tags")
	public Set<TacoJoint> tacoJoints;

	@OrderBy("name")
	public Set<TacoJoint> getTacoJoints(){
		return tacoJoints;
	}


	public Long getTagId() {
		return tagId;
	}

	public String getName() {
		return name;
	}
	
	public Tag(){
	}

	public Tag(String name) {
		this.name = name;

	}


}