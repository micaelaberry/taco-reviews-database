package taco.reviews.tacosjpaproject;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UpdateTacosController {

	@Resource
	private RegionRepository regionRepo;
	
	@Resource
	private TacoJointRepository jointRepo;
	
	@Resource
	private TagRepository tagRepo;

	@RequestMapping("/deleteTag")
	public String deleteReview(@RequestParam long regionId, @RequestParam long reviewId) {
		jointRepo.delete(reviewId);
		return "redirect:/region?regionId=" + regionId;
	}

//	@RequestMapping("/addTag")
//	public String createReview(@RequestParam long regionId, @RequestParam String name, @RequestParam String review) {
//		Region selected = regionRepo.findOne(regionId);
//		jointRepo.save(new TacoJoint(selected, name, review));
//		return "redirect:/region?regionId=" + regionId;
//	}
	
	@RequestMapping("/addTags")
	public String addTags(@RequestParam("regionId") Long id, @RequestParam("name") String newTagName) {
		
		Region selected = regionRepo.findOne(id);
		TacoJoint newTag = new TacoJoint(selected, newTagName, tagRepo.findByName("crunchy"));
		jointRepo.save(newTag);
		
		return "redirect:/region?id=" + id;
	}
	
}
