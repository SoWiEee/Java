import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //use Scanner to input data

        //a loop to execute five times
        for(int i = 0; i < 5; i++) {
            System.out.println("Enter a number between 1 and 30=>");
            int number = input.nextInt(); //input a number t
            if (number > 30 || number < 1) {    //check if the input is valid or not
                continue;//¸õ¹L³o­Ó°j°é
            }
            else{
                for(int j =0;j<number;j++){ //print the asterisks
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
