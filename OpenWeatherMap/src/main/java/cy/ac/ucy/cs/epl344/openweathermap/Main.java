package cy.ac.ucy.cs.epl344.openweathermap;

public class Main {

	private float temp;
	private double pressure;
	private int humidity;
	private float temp_min;
	private float temp_max;

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public double getPressure() {
                return pressure;
        }

        public void setPressure(double pressure) {
                this.pressure = pressure;
        }

	public int getHumidity() {
                return humidity;
        }

        public void setHumidity(int humidity) {
                this.humidity = humidity;
        }

	public float getTempMin() {
                return temp_min;
        }

        public void setTempMin(float temp_min) {
                this.temp_min = temp_min;
        }

	public float getTempMax() {
                return temp_max;
        }

        public void setTempMax(float temp_max) {
                this.temp_max = temp_max;
        }
}

