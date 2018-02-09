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
		System.out
				.println("=================Info about petals=================");

		// NPE
		for (Petel petal : petals) {
			System.out.println("Flower title: " + petal.size);
			System.out.println("Petal color: " + petal.size);
			System.out.println("Flower petals: " + petals.length);
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		}

	}
}
