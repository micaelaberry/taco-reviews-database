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
	public String retrieveStates(Model model) {
		model.addAttribute("states", regionRepo.findAll());
		return "regionList";

	}

	@RequestMapping("/joints")
	public String retrieveCities(Model model) {
		model.addAttribute("cities", jointRepo.findAll());
		return "jointsList";
	}

	@RequestMapping("/region")
	public String retrieveState(@RequestParam("id") long id, Model model) {
		model.addAttribute(regionRepo.findOne(id));
		return "region";
	}

	@RequestMapping("/joint")
	public String retrieveCity(@RequestParam("id") long id, Model model) {
		model.addAttribute(jointRepo.findOne(id));
		return "joint";
	}

}
