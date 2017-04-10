package presentation;

import java.io.File;

public class Lanceur {

	public static void main(String[] args) {


	//definition du répertoire à parcourir, l'attribut string à la valeur du disque C
	String rep="C:/";
	
	//Pointer le répertoire C via le constructeur file
	File f = new File(rep);
	
	//teste si le répertoire existe, true= existe et false = n'existe pas
	if (f.exists())
		
	{
		System.out.println(rep + " existe ");
		
		//le contenu du répertoire est renvoyé sous forme de tableau
		String[] contenu = f.list();
		
		//on parcourt les éléments du tableau
		for (int i=0; i<contenu.length; i++)
		{
			
		//on pointe chaque fichier contenu dans C:/ a chaque itération
		File f2 = new File(rep, contenu[i]);
			
			//si le contenu pointé est un répertoire
			if (f2.isDirectory())
			{
				//afficher le contenu du repertoire pointé à l'itération
				System.out.println("Répertoire : " + contenu[i]);
			}
	
			//si le contenu pointé est un fichier 
			else {
		
				//afficher le nom du fichier pointé à l'itération et sa taille en bytes
				System.out.println("Ficher : "+ contenu[i] + ", Taille du fichier : " + f2.length()/1024 + " bytes.");
	
			}
			
		}
			
	}
		
	else {
		
		System.out.println(rep+" n'existe pas");
	}

	}

}
