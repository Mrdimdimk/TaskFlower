package by.htp.flowers.runner;

import by.htp.flowers.model.FlowerOne;
import by.htp.flowers.model.Gardaner;

public class MainApp {

	public static void main(String[] args) {
	
		
		Gardaner gardener = new Gardaner("Mihalich");
		
		FlowerOne fl;  //������� ������     fl - ���������� ���������� ����
		fl = new FlowerOne("Rose", "Yellow"); // ��������� ������� ������
		
		gardener.informAbouFlowerState(fl);
		
		
		fl.bloom(5);
		gardener.informAbouFlowerState(fl);
		
		
		//System.out.println(fl.color+ " "+fl.title);
		//fl.color = "Red" ;
		//fl.title = "Rose";
		//System.out.println(fl.color+ " "+fl.title);
		
		

	}

}
