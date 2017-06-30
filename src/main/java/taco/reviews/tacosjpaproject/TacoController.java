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
	private JointRepository jointRepo;

	
	@RequestMapping("/regions")
	public String retrieveRegion(Model model) {
		model.addAttribute("region", regionRepo.findAll());
		return "regionList";
	}

	@RequestMapping("/joints")
	public String retrieveJoints(@RequestParam("id") long id, Model model) {
		model.addAttribute(regionRepo.findOne(id));
		return "jointList";
	}


	@RequestMapping("/joint")
	public String retrieveJoint(@RequestParam("id") long id, Model model) {
		model.addAttribute("joint", jointRepo.findOne(id));
		return "jointDetail";
	}

}
