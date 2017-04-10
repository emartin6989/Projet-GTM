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
			Connection conn = DaoConnexion.getConnection();
			// 3-Creer la requete
			/*
			 * PreparedStatement ps = conn.prepareStatement(
			 * "INSERT INTO client(nom,prenom) VALUES ('" + c.getNom() + "','" +
			 * c.getPrenom() + "')");
			 */
			PreparedStatement ps = conn
					.prepareStatement("INSERT INTO client(nom,prenom,couleuryeux,age) VALUES (?,?,?,?)");
			ps.setString(1, c.getNom());
			ps.setString(2, c.getPrenom());
			ps.setString(3, c.getCouleuryeux());
			ps.setInt(4, c.getAge());
			// 4-Executer la requete
			ps.executeUpdate();
			// 5-Presenter les resultats
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// code qui est executé quelles que soient les étapes précédentes
			// 6-Fermer la connexion
			DaoConnexion.closeConnection();
		}
	}

	@Override
	public void modifierClient(int id, String nom, String prenom, String couleuryeux, int age) {
		try {
			Connection conn = DaoConnexion.getConnection();
			// 3-Creer la requete
			PreparedStatement ps = conn
					.prepareStatement("UPDATE CLIENT SET nom =? , prenom = ?, couleuryeux = ? , age = ? where id = ?");
			ps.setString(1, nom);
			ps.setString(2, prenom);
			ps.setString(3, couleuryeux);
			ps.setInt(4, age);
			ps.setInt(5, id);
			// 4-Executer la requete
			ps.executeUpdate();
			// 5-Presenter les resultats
			// 6-Fermer la connexion
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// code qui est executé quelles que soient les étapes précédentes
			// 6-Fermer la connexion
			DaoConnexion.closeConnection();
		}
	}

	@Override
	public void supprimerClient(int id) {
		// TODO Auto-generated method stub
		try {
			Connection conn = DaoConnexion.getConnection();
			// 3-Creer la requete
			PreparedStatement ps = conn.prepareStatement("DELETE FROM client WHERE id= ?");
			ps.setInt(1, id);
			// 4-Executer la requete
			ps.executeUpdate();
			// 5-Presenter les resultats
			// 6-Fermer la connexion
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// code qui est executé quelles que soient les étapes précédentes
			DaoConnexion.closeConnection();
		}
	}

	@Override
	public Collection<Client> listerClients() {

		Collection<Client> cl = new ArrayList<Client>();
		try {
			Connection conn = DaoConnexion.getConnection();
			// 3-Creer la requete
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM client");
			// 4-Executer la requete
			ResultSet rs = ps.executeQuery();
			// 5-Presenter les resultats
			while (rs.next()) {
				Client c = new Client();
				c.setId(rs.getInt("id"));
				c.setNom(rs.getString("nom"));
				c.setPrenom(rs.getString("prenom"));
				c.setCouleuryeux(rs.getString("couleuryeux"));
				c.setAge(rs.getInt("age"));
				cl.add(c);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// code qui est executé quelles que soient les étapes précédentes
			DaoConnexion.closeConnection();
		}
		return cl;
	}

	@Override
	public Client chercherClient(int id) {
		Client c = new Client();
		try {
			Connection conn = DaoConnexion.getConnection();
			// 3-Creer la requete
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM client WHERE id = ?");
			ps.setInt(1, id);
			// 4-Executer la requete
			ResultSet rs = ps.executeQuery();
			// 5-Presenter les resultats
			rs.next();
			c.setId(rs.getInt("id"));
			c.setNom(rs.getString("nom"));
			c.setPrenom(rs.getString("prenom"));
			c.setCouleuryeux(rs.getString("couleuryeux"));
			c.setAge(rs.getInt("age"));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DaoConnexion.closeConnection();
		}
		return c;
	}

	@Override
	public Collection<Client> chercherParMC(String mc) {
		Collection<Client> cl = new ArrayList<Client>();
		try {
			Connection conn = DaoConnexion.getConnection();
			// 3-Creer la requete
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM client where nom like ? ");
			ps.setString(1, "%" + mc + "%");
			// 4-Executer la requete
			ResultSet rs = ps.executeQuery();
			// 5-Presenter les resultats
			while (rs.next()) {
				Client c = new Client();
				c.setId(rs.getInt("id"));
				c.setNom(rs.getString("nom"));
				c.setPrenom(rs.getString("prenom"));
				c.setCouleuryeux(rs.getString("couleuryeux"));
				c.setAge(rs.getInt("age"));
				cl.add(c);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DaoConnexion.closeConnection();
		}
		return cl;
	}
}
