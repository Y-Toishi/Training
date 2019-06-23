package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Training implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id;
	private int menu_id;
		private double weight;
		private String inputWeight;
		private String inputCount;
		public double getMaxWeight() {
			return maxWeight;
		}
		public void setMaxWeight(double maxWeight) {
			this.maxWeight = maxWeight;
		}
		private double maxWeight;
	public String getInputWeight() {
			return inputWeight;
		}
		public void setInputWeight(String inputWeight) {
			this.inputWeight = inputWeight;
		}
		public String getInputCount() {
			return inputCount;
		}
		public void setInputCount(String inputCount) {
			this.inputCount = inputCount;
		}
	private int count;
	private Date date;
	private String name;
	 public List<String> getErrorMessages() {
		return errorMessages;
	}
	public void setErrorMessages(List<String> errorMessages) {
		this.errorMessages = errorMessages;
	}
	public String getInputDate() {
		return inputDate;
	}
	public void setInputDate(String inputDate) {
		this.inputDate = inputDate;
	}
	private List<String> errorMessages;
	  private String inputDate;
    public Training() {

    }
	public Training(int id, int menu_id, int weight, int count, Date date, String name) {
		super();
		this.id = id;
		this.menu_id = menu_id;
		this.weight = weight;
		this.count = count;
		this.date = date;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean valueCheck() {
		errorMessages = new ArrayList<String>();



		if ( menu_id== 0) {
	        errorMessages.add("トレーニングメニューを選んでください。");
	    }
        //　+直前の文字の1回以上の繰り返し　　　?直前の文字は省略可能
	    if (inputWeight==null || inputWeight.isEmpty()) {
	        errorMessages.add("入力した重量が空です");
	    } else if (!inputWeight.matches("^([1-9]\\d*|0)(\\.\\d+)?$$")) {
	        errorMessages.add("小数を入力してください。");
	    }

        //^ 行の先頭　[1-9]どれか一文字　d*は整数0回以上繰り返し
	    //$ 行の終わり　\\は\
	    if (inputCount == null || inputCount.isEmpty()) {
	        errorMessages.add("入力した回数が空です");
	    }
	    else if (!inputCount.matches("^([1-9]\\d*|0)$$")) {
	        errorMessages.add("整数を入力してください。");
	    }
	   //  /^([1-9]\d*|0)(\.\d+)?$/
	    if (inputDate == null || inputDate.isEmpty()) {
	        errorMessages.add("入力した日付が空です");
	    }

	    else if (!inputDate.matches("\\d{4}-\\d{2}-\\d{2}")) {
	        errorMessages.add("入力した日付のフォーマットが違います");
	    }



		 return errorMessages.size()==0;
	}

}