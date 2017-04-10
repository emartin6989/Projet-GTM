package presentation;

import java.io.File;

public class Lanceur {

	public static void main(String[] args) {


	//definition du r�pertoire � parcourir, l'attribut string � la valeur du disque C
	String rep="C:/";
	
	//Pointer le r�pertoire C via le constructeur file
	File f = new File(rep);
	
	//teste si le r�pertoire existe, true= existe et false = n'existe pas
	if (f.exists())
		
	{
		System.out.println(rep + " existe ");
		
		//le contenu du r�pertoire est renvoy� sous forme de tableau
		String[] contenu = f.list();
		
		//on parcourt les �l�ments du tableau
		for (int i=0; i<contenu.length; i++)
		{
			
		//on pointe chaque fichier contenu dans C:/ a chaque it�ration
		File f2 = new File(rep, contenu[i]);
			
			//si le contenu point� est un r�pertoire
			if (f2.isDirectory())
			{
				//afficher le contenu du repertoire point� � l'it�ration
				System.out.println("R�pertoire : " + contenu[i]);
			}
	
			//si le contenu point� est un fichier 
			else {
		
				//afficher le nom du fichier point� � l'it�ration et sa taille en bytes
				System.out.println("Ficher : "+ contenu[i] + ", Taille du fichier : " + f2.length()/1024 + " bytes.");
	
			}
			
		}
			
	}
		
	else {
		
		System.out.println(rep+" n'existe pas");
	}

	}

}
