package cy.ac.ucy.cs.epl344.openweathermap;

import java.util.List;

public class ListClass {

	private long dt;
	private List<Weather> weather;
	private Main main;
	private Wind wind;
//	private Rain rain; // new done
//	private Snow snow; // new done
	private Clouds clouds;
	private String dt_txt;	
	private Sys sys;

	public Sys getSys(){
		return sys;
	}
	public void setSys(Sys sys){
		this.sys = sys;
	}
/*	
	public Snow getSnow(){
		return snow;
	}

	public void setSnow(Snow snow){
		this.snow = snow;
	}
	
	public Rain getRain(){
		return rain;
	}

	public void setRain(Rain rain){
		this.rain = rain;
	}
*/
	public String getDt_txt(){
		return dt_txt;
	}

	public void setDt_txt(String dt_txt){
		this.dt_txt = dt_txt;
	} 


	public List<Weather> getWeather() {
                return weather;
        }

        public void setWeather(List<Weather> weather) {
                this.weather = weather;
        }

	public Main getMain() {
                return main;
        }

        public void setMain(Main main) {
                this.main = main;
        }
	public Wind getWind() {
                return wind;
        }

        public void setWind(Wind wind) {
                this.wind = wind;
        }

	public Clouds getClouds() {
                return clouds;
        }

        public void setClouds(Clouds clouds) {
                this.clouds = clouds;
        }

	public Long getDt() {
                return dt;
        }

        public void setDt(long dt) {
                this.dt = dt;
        }
	
}
