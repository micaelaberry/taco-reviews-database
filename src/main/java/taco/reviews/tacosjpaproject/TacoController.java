package taco.reviews.tacosjpaproject;

import java.util.Collections;
import java.util.HashSet;

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

	@RequestMapping("/tacoregions") // returns all regions for tacos
	public String retrieveRegion(Model model) {
		model.addAttribute("region", regionRepo.findAll());
		return "regionList";
	}

	@RequestMapping("/allTacoJoints") // returns all taco joints
	public String retrieveTacoJoint(Model model) {
		model.addAttribute("tacoJoint", jointRepo.findAll());
		return "allTacoJoints";
	}

	@RequestMapping("/tacojoints") // returns taco joints from specific region
	public String retrieveTacoJoints(@RequestParam("id") long id, Model model) {
		model.addAttribute(regionRepo.findOne(id));
		return "tacoJointList";
	}

	@RequestMapping("/singleReview") // pulls one review
	public String retrieveSingleReview(@RequestParam("id") long id, Model model) {
		model.addAttribute(jointRepo.findOne(id));
		return "singleReview";
	}

	@RequestMapping("/allTags") // lists all the taco tags
	public String retrieveTags(Model model) {
		model.addAttribute("tags", tagRepo.findAll());
		return "tags";
	}

	@RequestMapping("/tag")
	public String retrieveSpecificTag(@RequestParam("id") long id, Model model) {
		Tag selectedTag = tagRepo.findOne(id);
		model.addAttribute(selectedTag);
		return "tags";
	}

	@RequestMapping("/deleteTag")
	public String deleteTag(@RequestParam long id, @RequestParam long tagId) {
		Tag toDelete = tagRepo.findOne(tagId);
		for(TacoJoint tacoJoint: toDelete.getTacoJoints()) {
			tacoJoint.remove(toDelete);
			jointRepo.save(tacoJoint);
		}
		tagRepo.delete(toDelete);
		//return "redirect:/tacoregions";
		return "redirect:/singleReview?id=" + id;		
		}

	@RequestMapping("/createTag")
	public String addTag(@RequestParam (value = "id") Long id, String name) {
		Tag tag = new Tag(name);
		tagRepo.save(tag);
		TacoJoint tacoJoint = jointRepo.findOne(id);
			tacoJoint.add(tag);
			jointRepo.save(tacoJoint);
			return "redirect:/singleReview?id=" + id;
		//return "redirect:/tacoregions";
	}
	
	
}