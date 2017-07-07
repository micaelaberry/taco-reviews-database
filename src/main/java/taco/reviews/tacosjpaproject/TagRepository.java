package taco.reviews.tacosjpaproject;

import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository<Tag, Long> {

	String findByName(String name);



}


