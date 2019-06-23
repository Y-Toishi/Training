package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Training;


public class TrainingDAO extends MySQLDAO{
  public List<Training>  findALL()throws Exception  {



      String sql = "SELECT * FROM training inner join Menu on"
      		+ " training.menu_id=Menu.id";
      PreparedStatement   pStmt= getPreparedStatement(sql);



      ResultSet rs = pStmt.executeQuery();

      List<Training> list= new ArrayList<Training>();
      while (rs.next()) {
        int id = rs.getInt("training.id");

        String name = rs.getString("Menu.name");
        int menu_id = rs.getInt("menu_id");
        int weight = rs.getInt("weight");
        int count = rs.getInt("count");
        Date day=rs.getDate("day");

        Training train = new Training(id, menu_id, weight,count,day,name);
        list.add(train);
      }

    return list;
  }
 public boolean registTraining(Training customer) throws Exception {

		boolean flag = true;

		String sql;
		PreparedStatement statement;

		try {


			sql = "insert into training (menu_id,weight,count,day) values(?,?,?,?)";
			statement = getPreparedStatement(sql);
			statement.setInt(1, customer.getMenu_id());
			statement.setDouble(2, Double.parseDouble(customer.getInputWeight()));
			statement.setInt(3, Integer.parseInt(customer.getInputCount()));
			statement.setString(4, customer.getInputDate());

			statement.executeUpdate();

			super.commit();
		} catch (Exception e) {
			super.rollback();
			throw e;
		}
		return flag;
	}

  public Training detail(int id) throws Exception {
		Training customer = null;


	      String sql = "SELECT * FROM training inner join Menu on"
	      		+ " training.menu_id=Menu.id where training.id = ?";
		PreparedStatement statement = getPreparedStatement(sql);
		statement.setInt(1, id);

		ResultSet rs = statement.executeQuery();

		if (rs.next()) {
			 //int id = rs.getInt("training.id");

		        String name = rs.getString("Menu.name");
		        int menu_id = rs.getInt("menu_id");
		        int weight = rs.getInt("weight");
		        int count = rs.getInt("count");
		        Date day=rs.getDate("day");

		        customer = new Training(id, menu_id, weight,count,day,name);






		}
		return customer;
	}

	public boolean registerUpdate(Training customer) throws Exception {
		boolean flag=true;

		String sql =
				"UPDATE training SET menu_id = ? , weight = ? , "
				+ "count = ? , day = ?  "
				+ "WHERE id = ?";

		// SQL文の実行

		PreparedStatement statement = getPreparedStatement(sql);

		statement.setInt(1, customer.getMenu_id());
		statement.setDouble(2, Double.parseDouble(customer.getInputWeight()));
		statement.setInt(3, Integer.parseInt(customer.getInputCount()));
		statement.setString(4, customer.getInputDate());


			statement.setInt(5,customer.getId());

		try {
			System.out.println(statement);


			statement.executeUpdate();

			super.commit();
		} catch (Exception e) {
			super.rollback();
			throw e;
		}

		return flag;
	}
	public Training maxWeight(int id) throws Exception {
		Training customer = null;


	      String sql = "SELECT weight,count FROM training where weight*count ="
	    		  +"(SELECT max(weight*count) FROM training where menu_id = ? ) and menu_id = ?;";
		PreparedStatement statement = getPreparedStatement(sql);
		statement.setInt(1, id);
		statement.setInt(2, id);
         System.out.println(statement);
		ResultSet rs = statement.executeQuery();

		if (rs.next()) {
			 //int id = rs.getInt("training.id");

           customer=new Training();

		        double weight = rs.getDouble("weight");

		     int count=rs.getInt("count");

		        customer.setMenu_id(id);

		     	customer.setWeight(weight);
		     	customer.setCount(count);

		     	customer.setMaxWeight(weight*count);






		}
		return customer;
	}

}