package taco.reviews.tacosjpaproject;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TacoPopulator implements CommandLineRunner {

	@Resource
	private RegionRepository regionRepo;

	@Resource
	private TacoJointRepository jointRepo;

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

		

		TacoJoint condado = new TacoJoint(central, 1L, "Condados", "images/condadoTacos.jpeg", "4 out of 5 Tacos!",
				"Condado Tacos... This establishment seems to be the new hip place to visit for DIY tacos. Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis.  ");

		TacoJoint nada = new TacoJoint(central, 2L, "Nada", "images/nadaTacos.jpeg", "4 out of 5 Tacos!",
				"Nada Tacos... This establishment seems to be the new hip place to visit for DIY tacos. Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis.  ");

		TacoJoint cantina = new TacoJoint(west, 3L, "Local Cantina", "images/cantinaTacos.jpeg", "3 out of 5 Tacos!",
				"Local Cantina Tacos... This establishment seems to be the new hip place to visit for DIY tacos. Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis. ");

		TacoJoint ranchito = new TacoJoint(west, 4L, "El Ranchito", "images/ranchitoTacos.jpeg", "3 out of 5 Tacos!",
				"El Ranchito Tacos... This establishment seems to be the new hip place to visit for DIY tacos. Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis. ");

		TacoJoint mimexico = new TacoJoint(east, 5L, "Mi Mexico", "images/mimexicoTacos.jpeg", "4.5 out of 5 Tacos!",
				"Mi Mexico Tacos... This establishment seems to be the new hip place to visit for DIY tacos. Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. ");

		TacoJoint jalapenos = new TacoJoint(east, 6L, "Los Jalapenos", "images/jalapenosTacos.jpeg",
				"3.5 out of 5 Tacos!",
				"Los Jalapenos Tacos... This establishment seems to be the new hip place to visit for DIY tacos. Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper convallis.");

		TacoJoint guachos = new TacoJoint(north, 7L, "Los Guachos", "images/guachosTacos.jpeg", "4 out of 5 Tacos!",
				"Los Guachos Tacos... This establishment seems to be the new hip place to visit for DIY tacos. Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. Ut suscipit semper");

		
		TacoJoint tacoloco = new TacoJoint(north, 8L, "Taco Loco", "images/tacolocoTacos.jpeg", "4.5 out of 5 Tacos!",
				"Taco Loco Tacos... This establishment seems to be the new hip place to visit for DIY tacos. Lorem ipsum dolor sit amet,"
						+ " consectetur adipiscing elit. ");
		
//		TacoJoint tacoloco = new TacoJoint(north, 8L, "Taco Loco", "images/tacolocoTacos.jpeg", "4.5 out of 5 Tacos!",
//				"Taco Loco Tacos... This establishment seems to be the new hip place to visit for DIY tacos. Lorem ipsum dolor sit amet,"
//						+ " consectetur adipiscing elit. Ut suscipit semper convallis. Nam interdum in turpis at lobortis. Aenean sit amet"
//						+ " aliquam augue. Aliquam scelerisque nisl nibh, tempor posuere");

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
