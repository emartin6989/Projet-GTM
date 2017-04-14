package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Adresse;
import metier.Contact;
import service.IService;
import service.Service;

/**
 * Servlet implementation class MaServlet
 */
@WebServlet("/MaServletAjout")
public class MaServletAjout extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MaServletAjout() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// 1 récupérer les param utilisateurs
		// je récupere les données saisies dans des variables
		String numRue = request.getParameter("numRue");
		String ville = request.getParameter("ville");
		String codePostal = request.getParameter("codePostal");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
	
		// 2 faire les traitements avec la couche service
		Adresse a = new Adresse();
		a.setCodePostal(codePostal);
		a.setVille(ville);
		a.setNumRue(numRue);
		
		Contact c = new Contact();
		c.setNom(nom);
		c.setPrenom(prenom);
		c.setEmail(email);
		
		// appeler l'interface service pour utiliser la methode ajout
		IService is = new Service();
		is.ajouterContactAdresse(c, a);

		// 3 préparer l'envoi des elts à la JSP
		// à gauche c'est le nom de l'attribut qu'on donnera dans la JSP. A
		// droite c'est le nom de la variable concernée dans la servlet
		request.setAttribute("larue", a.getNumRue());
		request.setAttribute("laville", a.getVille());
		request.setAttribute("lecode", a.getCodePostal());
		request.setAttribute("lenom", c.getNom());
		request.setAttribute("leprenom", c.getPrenom());
		request.setAttribute("lemail", c.getEmail());
		// 4 envoi des elts à la JSP
		//on indique le nom de la jsp concernée
		request.getRequestDispatcher("/ajouter.jsp").forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
