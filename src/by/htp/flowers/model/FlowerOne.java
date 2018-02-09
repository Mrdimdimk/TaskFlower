package by.htp.flowers.model;

public class FlowerOne {
	public String title;
	public String color;
	public Petel[] petal;

	public FlowerOne() { // конструкторы нужны дл€ инициализаци€ состо€ни€
							// объекта, которые хран€тс€ в хипе

	}

	public FlowerOne(String titel, String color) {
		this.color = color;
		this.title = titel; // ссылка на самого себ€

	}

	// 15
	public void bloom(int petalCount) {
		if (petalCount > 0) {
			petal = new Petel[petalCount];
			for (int i = 0; i < petalCount; i++) {
				petal[i] = new Petel(4, "oval", "red");
			}
			System.out.println();
		}

	}

	public void litlefade() {
		for (int i = 0; i < this.petal.length; i += 3) {
			this.petal[i] = null;
		}
	}

	public void totalfade() {
		for (int i = 0; i < this.petal.length; i++) {
			this.petal[i] = null;
			if (this.petal[i] != null) {
				this.petal[i] = null;
			}
		}
	}
}
