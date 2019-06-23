package model;

import javax.servlet.ServletException;

import dao.TrainingDAO;



public class UpdateLogic {
	public boolean execute(Training customer) throws ServletException {


	    if(!customer.valueCheck()){
	    	return false;
	    }

	    TrainingDAO dao = new TrainingDAO();
	    try {

	    	System.out.println("Connection open");
	   	 if(!dao.registerUpdate(customer)){

	    		 return false;
	    	 }

		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		} finally {
			// 例外が発生しても接続を閉じるようにfinallyで設定
			System.out.println("Connection close");
			dao.closeConnection();
		}

	    return true;
	  }

}
