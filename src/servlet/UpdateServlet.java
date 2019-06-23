package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Training;
import model.UpdateLogic;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
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
		request.setCharacterEncoding("UTF-8");
		int id=Integer.parseInt(request.getParameter("id"));
		String menu_id=request.getParameter("menu_id");
		String inputWeight=request.getParameter("inputWeight");

        String inputCount=request.getParameter("inputCount");
		String inputDate=request.getParameter("inputDate");


	    Training customer=new Training();
	    customer.setId(id);
	    customer.setMenu_id(Integer.parseInt(menu_id));
	    customer.setInputWeight(inputWeight);
	    customer.setInputDate(inputDate);
	    customer.setInputCount(inputCount);
        request.setAttribute("User", customer);


		UpdateLogic bo=new UpdateLogic();

		if(!bo.execute(customer)){
			RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/detail.jsp");
			rd.forward(request, response);
			return;
		}else{
			response.sendRedirect("/Training/SearchServlet");
		}

	}

}
