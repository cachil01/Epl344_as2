package cy.ac.ucy.cs.epl344.openweathermap;

import java.util.List;

public class WeatherForecast {

	private double message;
	private int cod;
	private int cnt;
	private List<ListClass> list;
	private City city;
	
	public int getCnt(){
		return cnt;
	}
	public void setCnt(int cnt){
		this.cnt = cnt;
	}

	public double getMessage(){
		return message;
	}
	public void setMessage(double message){
		this.message = message;
	}

	public int getCod(){
		return cod;
	}
	public void setCod(int cod){
		this.cod = cod;
	}

	public City getCity(){
		return city;
	}
	public void setCity(){
		this.city = city;
	}
	
	public List<ListClass> getList(){
		return list;
	}
	
	public void setList(List<ListClass> list){
		this.list = list;
	}
	



}
