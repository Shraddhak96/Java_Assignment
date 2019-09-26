package six;

import java.io.Serializable;

public class Nano extends Car implements Serializable
{
	 String carVer;
	 String carColor;
	 Double price;
	 Nano(String CarName, String carVer, String carColor, Double price) {
		super(CarName);
		this.carVer = carVer;
		this.carColor = carColor;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Nano [carVer=" + carVer + ", carColor=" + carColor + ", price=" + price + "]";
	}
	
}
