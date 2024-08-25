class Car1 {
	private String model;//�]�ܼƥ�private
	private String year;
	private double price;
	
	/* Set model, year, and price info of car. **///�禡�@�ߥ�public
	public void SetModel(String model) {//Set:�� public void Set�W�r(�ܼƳ�� �ܼƦW�r)
		this.model = model;
	}
	public void SetYear(String year) {
		this.year = year;
	}
	public void SetPrice(double price) {
		if (price >= 0) { /* Determine whether the input is valid or not. **/
			this.price = price; /* Set valid value to price. **/
		}
	}
	
	/* Get model, year, and price info. **/ 
	public String GetModel() {//Get�� public �ܼƳ�� Get�W�r()
		return model;
	}
	public String GetYear() {
		return year;
	}
	public double GetPrice() {
		return price;
	}

	public static void main(String[] args) {
		/* Create two cars. **///2��CAR���OClass
		Car CarA = new Car();
		Car CarB = new Car();
		
		/* Set info to two cars. **/ 
		CarA.SetModel("BMW");//Set �Ϊk: Class.Set�禡( ���e );
		CarA.SetYear("1995");
		CarA.SetPrice(20000);
		CarB.SetModel("BENZ");
		CarB.SetYear("2000");
		CarB.SetPrice(15000);
		
		/* Display info of cars. **///System.out.println���Y�� Get!
		System.out.println("Car Sample A: " + CarA.GetModel() + " " + CarA.GetYear() + " $" + CarA.GetPrice());
		System.out.println("Car Sample B: " + CarB.GetModel() + " " + CarB.GetYear() + " $" + CarB.GetPrice());
		
		/* Discount cars' price. **/
		CarA.SetPrice(0.95 * CarA.GetPrice());//Set �Ϊk: Class.Set�禡( ���e );
		CarB.SetPrice(0.93 * CarB.GetPrice());
		
		/* Display price of car again. **///System.out.println���Y�� Get!
		System.out.println("Car Sample A price(5% off): " + CarA.GetPrice());
		System.out.println("Car Sample B price(7% off): " + CarB.GetPrice());
	}
}
