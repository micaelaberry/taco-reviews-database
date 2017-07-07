package taco.reviews.tacosjpaproject;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

@Entity
public class Tag {

	@Id
	@GeneratedValue
	private Long tagId;
	
	private String name;
	
	@ManyToMany(mappedBy= "tags")
	public Set<TacoJoint> tacoJoints;

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