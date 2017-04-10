package presentation;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lanceur {

	public static void main(String[] args) throws IOException {

//je pointe le fichier 1
File f1 = new File("fichier1.txt");

// je lis le fichier 1
FileReader fr = new FileReader(f1);

//je pointe le fichier 2
File f2 = new File("fichier2.txt");

//j'écris le fichier 2
FileWriter fw = new FileWriter(f2);

// décryptage
File f3 = new File("fichier2.txt");
FileReader fr2 = new FileReader(f3);

File f4 = new File("fichier3.txt");
FileWriter fw2 = new FileWriter(f4);


//boucle de cryptage
int c;

while((c=fr.read())!=-1)
{
	fw.write(c+1);
}

fr.close();
fw.close();

//boucle de décryptage
 int e;
 
while((e=fr2.read())!=-1)
{
	fw2.write(e-1);
}
fr2.close();
fw2.close();
}

}
