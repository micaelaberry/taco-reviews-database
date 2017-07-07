package taco.reviews.tacosjpaproject;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TacoPopulator implements CommandLineRunner {

	@Resource
	private RegionRepository regionRepo;

	@Resource
	private TacoJointRepository jointRepo;
	
	@Resource
	private TagRepository tagRepo;

	@Override
	public void run(String... args) throws Exception {
		
		Tag yummy = new Tag( "yummy");
		Tag crunchy = new Tag("crunchy");
		Tag tasty = new Tag("tasty");
		Tag good = new Tag("good ");
		Tag spicy = new Tag( "spicy");
		Tag great = new Tag( "great");
		Tag filling = new Tag("filling");
		Tag awesome = new Tag("awesome");
		
		tagRepo.save(yummy);
		tagRepo.save(crunchy);
		tagRepo.save(tasty);
		tagRepo.save(good);
		tagRepo.save(spicy);
		tagRepo.save(great);
		tagRepo.save(filling);
		tagRepo.save(awesome);
		
		Region north = new Region("North");
		Region east = new Region("East");
		Region central = new Region("Central");
		Region west = new Region("West");

		regionRepo.save(north);
		regionRepo.save(east);
		regionRepo.save(central);
		regionRepo.save(west);
		

		TacoJoint condado = new TacoJoint(central, 1L, "Condados", "images/condadoTacos.jpeg",
				"Condado Tacos... This establishment seems to be the new hip place to visit for DIY tacos.orem ipsum dolor sit "
						+ "amet, consectetur adipiscing elit. Suspendisse tempus lorem eget auctor eleifend.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis Suspendisse tempus lorem eget auctor eleifend.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis",
				"4 out of 5 Tacos!", tasty, yummy);

		TacoJoint nada = new TacoJoint(central, 2L, "Nada", "images/nadaTacos.jpeg",
				"Nada Tacos... This establishment seems to be the new hip place to visit for DIY tacos. Suspendisse tempus lorem eget auctor eleifend.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis Suspendisse tempus lorem eget auctor eleifend.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis",
				"4 out of 5 Tacos!", yummy, crunchy);

		TacoJoint cantina = new TacoJoint(west, 3L, "Local Cantina", "images/cantinaTacos.jpeg",
				"Local Cantina Tacos... This establishment seems to be the new hip place to visit for DIY tacos. Suspendisse tempus lorem eget auctor eleifend.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis Suspendisse tempus lorem eget auctor eleifend.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis",
				"3 out of 5 Tacos!", tasty, good);

		TacoJoint ranchito = new TacoJoint(west, 4L, "El Ranchito", "images/ranchitoTacos.jpeg",
				"El Ranchito Tacos... This establishment seems to be the new hip place to visit for DIY tacos. Suspendisse tempus lorem eget auctor eleifend.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis Suspendisse tempus lorem eget auctor eleifend.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis",
				"3 out of 5 Tacos!", good, filling );

		TacoJoint mimexico = new TacoJoint(east, 5L, "Mi Mexico", "images/mimexicoTacos.jpeg",
				"Mi Mexico Tacos... This establishment seems to be the new hip place to visit for DIY tacos. Suspendisse tempus lorem eget auctor eleifend.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis Suspendisse tempus lorem eget auctor eleifend.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis ",
				"4.5 out of 5 Tacos!");

		TacoJoint jalapenos = new TacoJoint(east, 6L, "Los Jalapenos", "images/jalapenosTacos.jpeg",
				"Los Jalapenos Tacos... This establishment seems to be the new hip place to visit for DIY tacos. Suspendisse tempus lorem eget auctor eleifend.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis Suspendisse tempus lorem eget auctor eleifend.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis",
				"3.5 out of 5 Tacos!", filling, spicy );

		TacoJoint guachos = new TacoJoint(north, 7L, "Los Guachos", "images/guachosTacos.jpeg",
				"Los Guachos Tacos... This establishment seems to be the new hip place to visit for DIY tacos. Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper Suspendisse tempus lorem eget auctor eleifend.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis.",
				"4 out of 5 Tacos!", spicy, tasty);

		TacoJoint tacoloco = new TacoJoint(north, 8L, "Taco Loco", "images/tacolocoTacos.jpeg",
				"Taco Loco Tacos... This establishment seems to be the new hip place to visit for DIY tacos. Suspendisse tempus lorem eget auctor eleifend.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis. Suspendisse tempus lorem eget auctor eleifend.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis.Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis",
				"4.5 out of 5 Tacos!", awesome, crunchy);

		jointRepo.save(condado);
		jointRepo.save(nada);
		jointRepo.save(cantina);
		jointRepo.save(ranchito);
		jointRepo.save(mimexico);
		jointRepo.save(jalapenos);
		jointRepo.save(guachos);
		jointRepo.save(tacoloco);

		
		
	}
}
