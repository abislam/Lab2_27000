
import java.util.Scanner;

public class Lab2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int age;
		String name, hobby, movie, color, place;
		
		System.out.println("Please enter your name: ");
		name = input.nextLine();
		
		System.out.println("Please enter your age: ");
		age = input.nextInt();
		input.nextLine(); //consume newline left-over
		
		System.out.println("Please enter your favorite hobby: ");
		hobby = input.nextLine();
		
		System.out.println("Please enter your favorite movie: ");
		movie = input.nextLine();
		
		System.out.println("Please enter your favorite color: ");
		color = input.nextLine();
		
		System.out.println("Please enter your favorite city to visit: ");
		place = input.nextLine();
		input.close();
		
		System.out.println("My name is " + name + ". I am " + age + " years old. My favorite hobby is " + hobby + " and my favorite movie is " + movie + ". I love the color " + color + " and I love visiting " + place + ".");

		
	}
}
