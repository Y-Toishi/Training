package model;



import java.util.List;

import javax.servlet.ServletException;


import dao.TrainingDAO;

public class SearchLogic {
  public List<Training> execute() throws ServletException {
    TrainingDAO dao = new TrainingDAO();
    List<Training> list=null;
    try {

    	 list = dao.findALL();

	} catch (Exception e) {
		e.printStackTrace();
		throw new ServletException(e);
	} finally {

		dao.closeConnection();
	}

    return list;
  }
}