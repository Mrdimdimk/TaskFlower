package by.htp.flowers.model;

public class Gardaner {
	public String name;

	public Gardaner(String name) {
		this.name = name;
	}

	public void informAbouFlowerState(FlowerOne flower) {
		if (flower != null) {
			// NPE
			System.out.println("Flower title: " + flower.title);

			System.out.println("Flower color: " + flower.color);
			if (flower.petal != null) {
				this.informAboutFlowerPettals(flower.petal);
				;
			}

		}

	}

	public void informAboutFlowerPettals(Petel[] petals) {
		System.out.println("Petals Count " + getPetalsCount(petals));
		

		// NPE
		for (Petel petal : petals) {
			if (petal != null) {System.out
				.println("=================Info about petals=================");
				System.out.println("Petal siza: " + petal.size);
				System.out.println("Petal shape: " + petal.shape);
				System.out.println("Petal lenght: " + petals.length);
				System.out
						.println("___________________________________________________");
			}
		}
	}

	public int getPetalsCount(Petel[] petals) {
		int count = 0;
		for (Petel petal : petals)
			if (petal != null) {
				count++;
			}
		return count;
	}

}
