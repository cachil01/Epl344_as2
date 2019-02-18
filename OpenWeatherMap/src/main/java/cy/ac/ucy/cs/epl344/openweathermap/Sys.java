package cy.ac.ucy.cs.epl344.openweathermap;

public class Sys {

	private String pod;
	private int type;
	private int id;
	private float message;
	private String country;
	private long sunrise;
	private long sunset;

	public String getPod(){
		return pod;
	}
	public void setPop(String pod){
		this.pod = pod;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;;
	}

	public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

	public float getMessage() {
                return message;
        }

        public void setMessage(int message) {
                this.message = message;
        }

	public String getCountry() {
                return country;
        }

        public void setCountry(String country) {
                this.country = country;
        }

	public long getSunrise() {
                return sunrise;
        }

        public void setSunrise(long sunrise) {
                this.sunrise = sunrise;
        }

	public long getSunset() {
                return sunset;
        }

        public void setSunset(long sunset) {
                this.sunset = sunset;
        }
}

