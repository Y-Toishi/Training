package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MaxLogic;
import model.Training;

/**
 * Servlet implementation class MaxServlet
 */
@WebServlet("/MaxServlet")
public class MaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MaxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String menu_id = request.getParameter("menu_id");
        MaxLogic dl=new MaxLogic();
		Training customer;

			int id = Integer.parseInt(menu_id);


			customer=dl.execute(id);



		request.setAttribute("User", customer);


		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/max.jsp");
		rd.forward(request, response);


	}

}
