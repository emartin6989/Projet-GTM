package presentation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import metier.Compte;

public class Lanceur {

	public static void main(String[] args) throws IOException {

		Compte c1 = new Compte(35, "martinuche", 60);
		Compte c2 = new Compte(75, "totoche", 2030);
		
		File f= new File("Banque.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(c1);
		oos.writeObject(c2);
		
		oos.close();
		fos.close();
		
		

	}

}
