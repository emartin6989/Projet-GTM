package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MaServlet
 */
@WebServlet("/MaServlet")
public class MaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MaServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * String[] lesLoisirs = request.getParameterValues("Loisirs");
		 * response.getWriter().append("Served at: ").append(request.
		 * getContextPath())
		 * .append("\nCustomer Adress: ").append(request.getRemoteAddr())
		 * .append("\nNom : ").append(request.getParameter("nom"))
		 * .append("\nPr�nom : ").append(request.getParameter("prenom"))
		 * .append("\nMot de passe : ").append(request.getParameter("mdp"));
		 * 
		 * for(String l : lesLoisirs) { response.getWriter().append(l+"\n"); }
		 */
		request.setCharacterEncoding("UTF-8");
		// 1 r�cup�rer les param utilisateurs
		// je r�cupere les donn�es saisies dans des variables
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String mdp = request.getParameter("mdp");
		// il y a plusieurs valeurs pour le meme champ, il faut donc utiliser
		// Values
		String[] lesLoisirs = request.getParameterValues("Loisirs");

		// 2 faire les traitements avec la couche service

		// 3 pr�parer l'envoi des elts � la JSP
		// � gauche c'est le nom de l'attribut qu'on donnera dans la JSP. A
		// droite c'est le nom de la variable concern�e dans la servlet
		request.setAttribute("lenom", nom);
		request.setAttribute("leprenom", prenom);
		request.setAttribute("lemdp", mdp);
		request.setAttribute("lesloisirs", lesLoisirs);
		
		// 4 envoi des elts � la JSP
		//on indique le nom de la jsp concern�e
		request.getRequestDispatcher("/resultat.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
