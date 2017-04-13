package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import metier.Client;

public class Dao implements IDao {

	@Override
	public void ajouterClient(Client c) {
		// TODO Auto-generated method stub

		try {
			// 1-Charger le pilote
			Class.forName("com.mysql.jdbc.Driver");

			// 2-Creer la connexion
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bddclient", "root", "");

			// 3-Creer la requete
			/*
			 * PreparedStatement ps = conn.prepareStatement(
			 * "INSERT INTO client(nom,prenom) VALUES ('" + c.getNom() + "','" +
			 * c.getPrenom() + "')");
			 */
			PreparedStatement ps = conn.prepareStatement("INSERT INTO client(nom,prenom,CouleurYeux) VALUES (?,?,?)");
			ps.setString(1, c.getNom());
			ps.setString(2, c.getPrenom());
			ps.setString(3, c.getCouleuryeux());

			// 4-Executer la requete
			ps.executeUpdate();

			// 5-Presenter les resultats

			// 6-Fermer la connexion
			conn.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// code qui est executé quelles que soient les étapes précédentes
		}
	}

	@Override
	public void modifierClient(int Id, String nom, String prenom, String couleuryeux) {

		try {
			// 1-Charger le pilote
			Class.forName("com.mysql.jdbc.Driver");

			// 2-Creer la connexion
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bddclient", "root", "");

			// 3-Creer la requete
			PreparedStatement ps = conn.prepareStatement("UPDATE CLIENT SET nom =? , prenom = ?, CouleurYeux = ? where id = ?");
			ps.setString(1, nom);
			ps.setString(2, prenom);
			ps.setString(3, couleuryeux);
			ps.setInt(4, Id);

			// 4-Executer la requete
			ps.executeUpdate();

			// 5-Presenter les resultats

			// 6-Fermer la connexion
			conn.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// code qui est executé quelles que soient les étapes précédentes
		}

	}

	@Override
	public void supprimerClient(int Id) {
		// TODO Auto-generated method stub

		try {
			// 1-Charger le pilote
			Class.forName("com.mysql.jdbc.Driver");

			// 2-Creer la connexion
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bddclient", "root", "");

			// 3-Creer la requete
			PreparedStatement ps = conn.prepareStatement("DELETE FROM client WHERE Id= ?");
			ps.setInt(1, Id);
			
			// 4-Executer la requete
			ps.executeUpdate();

			// 5-Presenter les resultats

			// 6-Fermer la connexion
			conn.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// code qui est executé quelles que soient les étapes précédentes
		}
	}

	@Override
	public Collection<Client> listerClients() {

		Collection<Client> cl = new ArrayList<Client>();
		try {
			// 1-Charger le pilote
			Class.forName("com.mysql.jdbc.Driver");

			// 2-Creer la connexion
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bddclient", "root", "");

			// 3-Creer la requete
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM client");

			// 4-Executer la requete
			ResultSet rs = ps.executeQuery();

			// 5-Presenter les resultats

			while (rs.next()) {
				Client c = new Client();
				c.setId(rs.getInt("Id"));
				c.setNom(rs.getString("Nom"));
				c.setPrenom(rs.getString("Prenom"));
				c.setCouleuryeux(rs.getNString("CouleurYeux"));
				cl.add(c);
			}

			// 6-Fermer la connexion
			conn.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// code qui est executé quelles que soient les étapes précédentes
		}

		return cl;
	}

	@Override
	public Client chercherClient(int Id) {

		Client c = new Client();

		try {
			// 1-Charger le pilote
			Class.forName("com.mysql.jdbc.Driver");

			// 2-Creer la connexion
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bddclient", "root", "");

			// 3-Creer la requete
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM client WHERE Id = ?");
			ps.setInt(1, Id);

			// 4-Executer la requete
			ResultSet rs = ps.executeQuery();

			// 5-Presenter les resultats
			rs.next();
			c.setId(rs.getInt("Id"));
			c.setNom(rs.getString("Nom"));
			c.setPrenom(rs.getString("Prenom"));
			c.setCouleuryeux(rs.getNString("CouleurYeux"));
			
			// 6-Fermer la connexion
			conn.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// code qui est executé quelles que soient les étapes précédentes
		}
		return c;
	}

	@Override
	public Collection<Client> chercherParMC(String mc) {
		Collection<Client> cl = new ArrayList<Client>();
		try {
			// 1-Charger le pilote
			Class.forName("com.mysql.jdbc.Driver");

			// 2-Creer la connexion
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bddclient", "root", "");

			// 3-Creer la requete
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM client where nom like ? ");
			ps.setString(1, "%"+mc+"%");
						// 4-Executer la requete
			ResultSet rs = ps.executeQuery();

			// 5-Presenter les resultats

			while (rs.next()) {
				Client c = new Client();
				c.setId(rs.getInt("Id"));
				c.setNom(rs.getString("Nom"));
				c.setPrenom(rs.getString("Prenom"));
				c.setCouleuryeux(rs.getNString("CouleurYeux"));
				cl.add(c);
			}

			// 6-Fermer la connexion
			conn.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// code qui est executé quelles que soient les étapes précédentes
		}

		return cl;
	}

}
