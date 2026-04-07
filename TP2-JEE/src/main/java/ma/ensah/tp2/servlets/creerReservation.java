package ma.ensah.tp2.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ma.ensah.tp2.models.Client;
import ma.ensah.tp2.models.Reservation;

import java.io.IOException;

/**
 * Servlet implementation class creerReservation
 */
@WebServlet("/creerReservation")
public class creerReservation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public creerReservation() {
        super();
        // TODO Auto-generated constructor stub
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
		String type = request.getParameter("type");
		String prix = request.getParameter("prix");
		String vue = request.getParameter("vue");
		
		if(nom.isEmpty() || prenom.isEmpty() || telephone.isEmpty() || email.isEmpty() || type.isEmpty() || prix.isEmpty() || vue.isEmpty()) {
			request.setAttribute("error", "Ooops, erreur !!! Vous devez remplir tous les champs");
			request.getRequestDispatcher("/reservation.jsp").forward(request,response);
		} else {
			Client client = new Client(nom,prenom,telephone,email);
			double prixDouble = Double.parseDouble(prix);
			Reservation reservation = new Reservation(client, type, prixDouble, vue);
			request.setAttribute("reservation", reservation);
			request.getRequestDispatcher("/infoReservation.jsp").forward(request, response);
		}
	}

}
