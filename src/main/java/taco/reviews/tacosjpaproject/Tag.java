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
	private Long id;
	private String name;
	private String review;
	
	@ManyToMany(mappedBy= "tags")
	private Set<TacoJoint> eatFood;
	
	public Set<TacoJoint> getEatFood(){
		return eatFood;
	}


	public Long getId() {
		return id;
	}
	
//	public TacoJoint getTacoJoint() {
//		return tacoJoint;
//	}
	
//	public void setTacoJoint(TacoJoint tacoJoint) {
//		this.tacoJoints = tacoJoints;
//	}

	public String getName() {
		return name;
	}
	
	public String getReview() {
		return review;
	}

	private Tag(){
	}

	public Tag(String name) {
		this.name = name;
	}
	
	public Tag(TacoJoint tacoJoint, String name, String review) {
		this.name = name;
		this.review = review;
	}

	public void remove(Tag tag) {
		
	}




	
}