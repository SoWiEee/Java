
public class CarApplication {

	public static void main(String[] args) {
		/* Application to check capability of car class.**/
		Car Sample = new Car();//�I�s�ƨ禡
		System.out.println("Test Sample car capability");
		System.out.println("Model: " + Sample.GetModel() + " Year: " + Sample.GetYear() + " Price: " + Sample.GetPrice());
	}
}
