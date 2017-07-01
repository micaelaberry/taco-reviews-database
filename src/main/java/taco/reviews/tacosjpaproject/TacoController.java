package taco.reviews.tacosjpaproject;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TacoController {
	@Resource
	private RegionRepository regionRepo;

	@Resource
	private TacoJointRepository jointRepo;

	
	@RequestMapping("/tacoregions") //returns all regions for tacos
	public String retrieveRegion(Model model) {
		model.addAttribute("region", regionRepo.findAll());
		return "regionList";
	}

	@RequestMapping("/tacojoints") //returns taco joints for specific region
	public String retrieveJoints(@RequestParam("id") long id, Model model) {
		model.addAttribute(regionRepo.findOne(id));
		return "tacoJointList";
	}


	@RequestMapping("/singleReview") //
	public String retrieveSingleReview(@RequestParam("id") long id, Model model) {
		model.addAttribute(jointRepo.findOne(id));
		return "singleReview";
	}

}