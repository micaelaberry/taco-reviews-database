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
		Region north = new Region("North");
		Region east = new Region("East");
		Region central = new Region("Central");
		Region west = new Region("West");
		
		regionRepo.save(north);
		regionRepo.save(east);
		regionRepo.save(central);
		regionRepo.save(west);
		
		Joint condado = new Joint(central, "Condados");
		Joint cantina = new Joint(west, "Local Cantina");
		Joint mimexico = new Joint(east, "Mi Mexico");
		Joint guachos = new Joint(north, "Los Guachos");
		
		jointRepo.save(condado);
		jointRepo.save(cantina);
		jointRepo.save(mimexico);
		jointRepo.save(guachos);
	}

}
