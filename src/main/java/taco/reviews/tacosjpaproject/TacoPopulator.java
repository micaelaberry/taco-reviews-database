package taco.reviews.tacosjpaproject;
import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TacoPopulator implements CommandLineRunner{

	@Resource
	private RegionRepository regionRepo;
	
	@Resource
	private JointRepository jointRepo;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
