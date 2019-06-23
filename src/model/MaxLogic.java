package model;

import javax.servlet.ServletException;

import dao.TrainingDAO;

public class MaxLogic {
	public Training execute(int id) throws ServletException {

		Training account = null;

		TrainingDAO dao = new TrainingDAO();
		try {

			account = dao.maxWeight(id);

			System.out.println("Connection open");

		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		} finally {
			// 例外が発生しても接続を閉じるようにfinallyで設定
			System.out.println("Connection close");
			dao.closeConnection();
		}

		return account;
	}
}
