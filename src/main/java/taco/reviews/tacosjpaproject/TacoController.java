package taco.reviews.tacosjpaproject;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TacoController {
	@Resource
	private RegionRepository regionRepo;

	@Resource
	private TacoJointRepository jointRepo;
	
	@Resource
	private TagRepository tagRepo;

	
	@RequestMapping("/tacoregions") //returns all regions for tacos
	public String retrieveRegion(Model model) {
		model.addAttribute("region", regionRepo.findAll());
		return "regionList";
	}
	
	@RequestMapping("/allReviews") //returns all reviews tacos
	public String retrieveTacoJoint(Model model) {
		model.addAttribute("tacoJoint", jointRepo.findAll());
		return "allReviews";
	}

	@RequestMapping("/tacojoints") //returns taco joints from specific region
	public String retrieveTacoJoints(@RequestParam("id") long id, Model model) {
		model.addAttribute(regionRepo.findOne(id));
		return "tacoJointList";
	}


	@RequestMapping("/singleReview") //pulls one review
	public String retrieveSingleReview(@RequestParam("id") long id, Model model) {
		model.addAttribute(jointRepo.findOne(id));
		return "singleReview";
	}

	@RequestMapping("/tags")
	public String showTags(Model model){
	model.addAttribute("tags", tagRepo.findAll());
	return "tags";
	}
	
	@RequestMapping("/tags/delete/{id}")
	public String deleteFood(@PathVariable long id) {
		Tag toDelete = tagRepo.findOne(id);
		for(TacoJoint tacoJoint: toDelete.getTacoJoints()) {
			tacoJoint.remove(toDelete);
			jointRepo.save(tacoJoint);
		}
		tagRepo.delete(toDelete);
		return "redirect:/tacoregions";
	}
	
//	@RequestMapping("/addTags")
//	public String addTags(@RequestParam("regionId") Long id, @RequestParam("name") String newTagName) {
//		
//		Region selected = regionRepo.findOne(id);
//		TacoJoint newTag = new TacoJoint(selected, newTagName, tagRepo.findByName("yummy"));
//		jointRepo.save(newTag);
//		
//		return "redirect:/region?id=" + id;
//	}
	

}