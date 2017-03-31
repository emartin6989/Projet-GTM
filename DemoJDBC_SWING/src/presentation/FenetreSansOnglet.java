package presentation;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import metier.Client;
import service.ClientService;
import service.IClientService;

public class FenetreSansOnglet extends JFrame {

	// liste des composants de ma fenêtre = objet
	private JLabel jl1 = new JLabel("NOM");
	private JLabel jl2 = new JLabel("Prenom");
	private JLabel jl3 = new JLabel("yeux");
	private JTextField jtf1 = new JTextField(12);
	private JTextField jtf2 = new JTextField(12);
	private JTextField jtf3 = new JTextField(12);
	private JButton jb1 = new JButton("Ajouter");

	// declaration de l'interface
	private IClientService service = new ClientService();
	private Client c = new Client();

	// je prépare une fenêtre qui le plus grand container avec un nom et une
	// taille
	public FenetreSansOnglet(String nom) {
		super(nom);
		setSize(800, 600);

		// j'organise les composants = la disposition, le layout
		// BorderLayout signifie disposition ligne par ligne
		this.setLayout(new BorderLayout());

		// ajout de la premiere ligne composée de 5 éléments
		// il faut faire un pemier container ou JPanel
		JPanel jp1 = new JPanel();

		// je précise que mes components sont à disposer en ligne avec
		// flowlayout
		jp1.setLayout(new FlowLayout());

		// j'ajoute mes components au container
		jp1.add(jl1);
		jp1.add(jtf1);

		// création du second container avec les deux listes
		JPanel jp2 = new JPanel();

		// je précise que mes components sont à disposer en ligne avec
		// flowlayout
		jp2.setLayout(new FlowLayout());

		// j'ajoute mes components au container
		jp2.add(jl2);
		jp2.add(jtf2);

		// création du second container avec les deux listes
		JPanel jp3 = new JPanel();

		// je précise que mes components sont à disposer en ligne avec
		// flowlayout
		jp3.setLayout(new FlowLayout());

		// j'ajoute mes components au container
		jp3.add(jl3);
		jp3.add(jtf3);

		// création du second container avec les deux listes
		JPanel jp4 = new JPanel();

		// je précise que mes components sont à disposer en ligne avec
		// flowlayout
		jp4.setLayout(new FlowLayout());

		// j'ajoute mes components au container
		jp4.add(jb1);

		// création du container permettant d'aligner sur une colonne les 4
		// containers
		JPanel jp5 = new JPanel();

		// boxlayout.PAGE_AXIS permet d'aligner sur une colonne sur les
		// containers
		jp5.setLayout(new BoxLayout(jp5, BoxLayout.PAGE_AXIS));
		jp5.add(jp1);
		jp5.add(jp2);
		jp5.add(jp3);
		jp5.add(jp4);

		// indiquer qu'on veut mettre le container en haut de la fenetre
		this.add(jp5, BorderLayout.NORTH);

		// rendre le bouton ajouter actif en lui permettant d'ajouter un client
		// dans la bdd
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// recuperation de la saisie de l'utilisateur
				String nom = jtf1.getText();
				String prenom = jtf2.getText();
				String yeux = jtf3.getText();
				//attribution des valeurs a l objet client
				c.setNom(nom);
				c.setPrenom(prenom);
				c.setCouleuryeux(yeux);
				//ajout du client via l'interface service
				service.ajouterClient(c);
				
				//vider le champs après ajout en base
				jtf1.setText("");
				jtf2.setText("");
				jtf3.setText("");
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FenetreSansOnglet f = new FenetreSansOnglet("Ma fenêtre");
		f.setVisible(true);
	}
}
