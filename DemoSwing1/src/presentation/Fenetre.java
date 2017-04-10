package presentation;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Fenetre extends JFrame {
	
	//liste des composants de ma fenêtre = objet
	private JLabel jl = new JLabel("Recepteur");
	private JTextField jtf = new JTextField(12);
	private JButton jb1 = new JButton("Ajouter");
	private JButton jb2 = new JButton("Déplacer");
	private JButton jb3 = new JButton("Vider");
	
	private List liste1 = new List();
	private List liste2 = new List();
	
	//je prépare une fenêtre qui le plus grand container avec un nom et une taille
	public Fenetre(String nom){
		super(nom);
		setSize(800,600);
		
		//j'organise les composants = la disposition, le layout
		//BorderLayout signifie disposition ligne par ligne
		this.setLayout(new BorderLayout());
		
		//ajout de la premiere ligne composée de 5 éléments
		//il faut faire un pemier container ou JPanel
		JPanel jp1 = new JPanel();
		
		//je précise que mes components sont à disposer en ligne avec flowlayout
		jp1.setLayout(new FlowLayout());
		
		//j'ajoute mes components au container
		jp1.add(jl); jp1.add(jtf); jp1.add(jb1); jp1.add(jb2); jp1.add(jb3);
		
		//indiquer qu'on veut mettre le container en haut de la fenetre
		this.add(jp1,BorderLayout.NORTH);
		
		//création du second container avec les deux listes
		JPanel jp2 = new JPanel();
		
		//indiquer la disposition des deux listes en colonnes
		jp2.setLayout(new GridLayout());
		
		//ajouter les components listes au container
		jp2.add(liste1); jp2.add(liste2);
		
		//indiquer qu'on veut mettre le second container au centre
		this.add(jp2, BorderLayout.CENTER);
		
		
		
		
		
	}
	

}
