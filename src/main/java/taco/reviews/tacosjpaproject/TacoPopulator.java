package taco.reviews.tacosjpaproject;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TacoPopulator implements CommandLineRunner {

	@Resource
	private RegionRepository regionRepo;

	@Resource
	private JointRepository jointRepo;

	private String name;
	private String description;
	private String taste;
	private String imageURL;

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
	
//		 reviewCondado = new Taco(condado,"Condado", "images/condadoTacos.jpeg",
//				"4 out of 5 Tacos!",
//				"Condado Tacos... This establishment seems to be the new hip place to visit for DIY tacos. They have a "
//				+ "simple form that you fill out specifying all the delicious tacos toppings you can think of. Fear not "
//				+ "vegetarian/vegan friends, they also have options for you if you aren't feeling carnivorous. Keep in mind "
//				+ "that the usual free chips and salsa you get at restaurants is not free at all. Still delicious!");


	}
}
