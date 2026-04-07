package ma.ensah.tp2.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ma.ensah.tp2.models.Client;

import java.io.IOException;

/**
 * Servlet implementation class creerClient
 */
@WebServlet("/creerClient")
public class creerClient extends HttpServlet {
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public creerClient() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String telephone = request.getParameter("telephone");
		String email = request.getParameter("email");
		
		if(nom.isEmpty() || prenom.isEmpty() || telephone.isEmpty() || email.isEmpty()) {
			request.setAttribute("error", "Ooops, erreur !!! Vous devez remplir tous les champs");
			request.getRequestDispatcher("/inscription.jsp").forward(request,response);
		} else {
			Client client = new Client(nom,prenom,telephone,email);
			request.setAttribute("client", client);
			request.getRequestDispatcher("/infoClient.jsp").forward(request, response);
		}
	}

}
