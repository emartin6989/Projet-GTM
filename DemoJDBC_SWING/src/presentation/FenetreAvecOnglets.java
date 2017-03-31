package presentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import metier.Client;
import service.ClientService;
import service.IClientService;

public class FenetreAvecOnglets extends JFrame {

	// liste des composants de ma fenêtre = objet
	private JTabbedPane onglets = new JTabbedPane(SwingConstants.TOP);

	// liste des composants de l'onglet 1
	private JPanel onglet1 = new JPanel();
	private JLabel jl1 = new JLabel("NOM");
	private JTextField jtf1 = new JTextField(12);
	private JLabel jl2 = new JLabel("Prenom");
	private JTextField jtf2 = new JTextField(12);
	private JLabel jl3 = new JLabel("yeux");
	private JTextField jtf3 = new JTextField(12);
	private JButton jb1 = new JButton("Ajouter");

	// liste des composants de l'onglet 2
	private JPanel onglet2 = new JPanel();
	private JLabel jl4 = new JLabel("Id");
	private JTextField jtf4 = new JTextField(12);
	private JButton jb2 = new JButton("Ajouter");

	// liste des composants de l'onglet 3
	private JPanel onglet3 = new JPanel();
	private JLabel jl8 = new JLabel("Id");
	private JTextField jtf8 = new JTextField(12);
	private JLabel jl5 = new JLabel("NOM");
	private JTextField jtf5 = new JTextField(12);
	private JLabel jl6 = new JLabel("Prenom");
	private JTextField jtf6 = new JTextField(12);
	private JLabel jl7 = new JLabel("yeux");
	private JTextField jtf7 = new JTextField(12);
	private JButton jb3 = new JButton("Modifier");

	// liste des composants de l'onglet 4
	private JPanel onglet4 = new JPanel();
	private JLabel jl9 = new JLabel("Mots clés");
	private JTextField jtf9 = new JTextField(12);
	private JButton jb4 = new JButton("Rechercher");
	// gerer les défilements
	private JScrollPane jsp;
	// appel du modele
	private ClientModele modele;
	// associé le modele de tableau aux données
	private JTable jTableClients;

	// declaration de l'interface
	private IClientService service = new ClientService();
	private Client c = new Client();

	// je prépare une fenêtre qui le plus grand container avec un nom et une
	// taille

	public FenetreAvecOnglets(String nom) {
		super(nom);
		setSize(800, 600);

		// j'organise les composants = la disposition, le layout
		// BorderLayout signifie disposition ligne par ligne
		this.setLayout(new BorderLayout());

		// j'ajoute mon menu d'onglet à la fenetre
		this.add(onglets);

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

		// indiquer qu'on veut mettre le container en haut de la fenetre de
		// l'onglet 1
		onglet1.add(jp5, BorderLayout.NORTH);
		onglet1.setBackground(Color.blue);

		// nommer l'onglet1 dans le menu d'onglet
		onglets.addTab("Ajouter", onglet1);
		// rendre le bouton ajouter actif en lui permettant d'ajouter un client
		// dans la bdd
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// recuperation de la saisie de l'utilisateur
				String nom = jtf1.getText();
				String prenom = jtf2.getText();
				String yeux = jtf3.getText();
				// attribution des valeurs a l objet client
				c.setNom(nom);
				c.setPrenom(prenom);
				c.setCouleuryeux(yeux);
				// ajout du client via l'interface service
				service.ajouterClient(c);

				// vider le champs après ajout en base
				jtf1.setText("");
				jtf2.setText("");
				jtf3.setText("");
			}
		});
		JPanel jp6 = new JPanel();
		jp6.setLayout(new FlowLayout());

		// j'ajoute mes components au container
		jp6.add(jl4);
		jp6.add(jtf4);
		jp6.add(jb2);

		onglet2.add(jp6, BorderLayout.NORTH);
		onglet2.setBackground(Color.GREEN);
		onglets.addTab("Supprimer", onglet2);

		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = jtf4.getText();
				int i;
				i = Integer.parseInt(id);

				service.supprimerClient(i);

				// vider le champs après ajout en base
				jtf4.setText("");
			}
		});

		// ajout de la premiere ligne composée de 5 éléments
		// il faut faire un pemier container ou JPanel
		JPanel jp7 = new JPanel();

		// je précise que mes components sont à disposer en ligne avec
		// flowlayout
		jp7.setLayout(new FlowLayout());

		// j'ajoute mes components au container
		jp7.add(jl8);
		jp7.add(jtf8);

		// création du second container avec les deux listes
		JPanel jp8 = new JPanel();

		// je précise que mes components sont à disposer en ligne avec
		// flowlayout
		jp8.setLayout(new FlowLayout());

		// j'ajoute mes components au container
		jp8.add(jl5);
		jp8.add(jtf5);

		// création du second container avec les deux listes
		JPanel jp9 = new JPanel();

		// je précise que mes components sont à disposer en ligne avec
		// flowlayout
		jp9.setLayout(new FlowLayout());

		// j'ajoute mes components au container
		jp9.add(jl6);
		jp9.add(jtf6);

		// création du second container avec les deux listes
		JPanel jp10 = new JPanel();

		// je précise que mes components sont à disposer en ligne avec
		// flowlayout
		jp10.setLayout(new FlowLayout());

		// j'ajoute mes components au container
		jp10.add(jl7);
		jp10.add(jtf7);

		// création du second container avec les deux listes
		JPanel jp11 = new JPanel();

		// je précise que mes components sont à disposer en ligne avec
		// flowlayout
		jp11.setLayout(new FlowLayout());

		// j'ajoute mes components au container
		jp11.add(jb3);

		// création du container permettant d'aligner sur une colonne les 4
		// containers
		JPanel jp12 = new JPanel();

		// boxlayout.PAGE_AXIS permet d'aligner sur une colonne sur les
		// containers
		jp12.setLayout(new BoxLayout(jp12, BoxLayout.PAGE_AXIS));
		jp12.add(jp7);
		jp12.add(jp8);
		jp12.add(jp9);
		jp12.add(jp10);
		jp12.add(jp11);

		// indiquer qu'on veut mettre le container en haut de la fenetre de
		// l'onglet 3
		onglet3.add(jp12, BorderLayout.NORTH);
		onglet3.setBackground(Color.MAGENTA);

		// nommer l'onglet3 dans le menu d'onglet
		onglets.addTab("MAJ", onglet3);

		jb3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = jtf8.getText();
				int i;
				i = Integer.parseInt(id);
				String nom2 = jtf5.getText();
				String prenom2 = jtf6.getText();
				String yeux2 = jtf7.getText();

				service.modifierClient(i, nom2, prenom2, yeux2);

				// vider le champs après ajout en base
				jtf5.setText("");
				jtf6.setText("");
				jtf7.setText("");
				jtf8.setText("");
			}
		});

		
		// il faut faire un pemier container ou JPanel
		JPanel jp13 = new JPanel();

		// je précise que mes components sont à disposer en ligne avec
		// flowlayout
		jp13.setLayout(new FlowLayout());
		jp13.setBackground(Color.RED);
		jl9.setForeground(Color.WHITE);
				
		// j'ajoute mes components au container
		jp13.add(jl9);
		jp13.add(jtf9);
		jp13.add(jb4);

		// indiquer qu'on veut mettre le container en haut de la fenetre de
		// l'onglet4
		onglet4.add(jp13, BorderLayout.NORTH);
		onglet4.setLayout(new BoxLayout(onglet4, BoxLayout.PAGE_AXIS));
				
		//ajout du tableau et passage à l'onglet
		modele = new ClientModele();
		jTableClients = new JTable(modele);
		jTableClients.setBackground(Color.RED);
		jTableClients.setForeground(Color.WHITE);
		jsp = new JScrollPane(jTableClients);
		onglet4.add(jsp, BorderLayout.CENTER);
		
		// nommer l'onglet4 dans le menu d'onglet
				onglets.addTab("Lister", onglet4);
				
		jb4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String mc = jtf9.getText();
				modele.setData((List<Client>) service.chercherParMC(mc));
				

				// vider le champs après ajout en base
				jtf5.setText("");
				jtf6.setText("");
				jtf7.setText("");
				jtf8.setText("");
			}
		});

		// nommer l'onglet1 dans le menu d'onglet
		onglets.addTab("Lister", onglet4);

		onglets.setBackgroundAt(0, Color.BLUE);
		onglets.setForegroundAt(0, Color.WHITE);
		add(onglets);

		onglets.setBackgroundAt(1, Color.GREEN);
		add(onglets);

		onglets.setBackgroundAt(2, Color.MAGENTA);
		add(onglets);

		onglets.setBackgroundAt(3, Color.RED);
		onglets.setForegroundAt(3, Color.WHITE);
		add(onglets);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FenetreAvecOnglets f = new FenetreAvecOnglets("Ma fenêtre");
		f.setVisible(true);
	}
}
