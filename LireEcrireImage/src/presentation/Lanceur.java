package presentation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lanceur {

	public static void main(String[] args) throws IOException {

//lire l'image
File f= new File("Gastornis.jpg");
FileInputStream fi = new FileInputStream(f);


//ecrire une nouvelle image
File f2 = new File("NouvelleImage.jpg");
FileOutputStream fo = new FileOutputStream(f2);


//recopier le contenu de l'image 1 dans la nouvelle image 2
int a;
while((a=fi.read())!=-1){
	fo.write(a);
}

fi.close();
fo.close();
	}

}
