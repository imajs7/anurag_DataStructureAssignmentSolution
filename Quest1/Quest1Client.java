package Quest1;

import java.util.Scanner;

public class Quest1Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the total no of floors in the building: ");
		Building b = new Building( input.nextInt() );
		
		for(int i = 1; i <= b.getFloor(); i++) {
			System.out.printf("Enter the floor size given on day %d: ", i);
			b.saveSize(input.nextInt() );;
		}
		
		b.build();
		
		input.close();

	}

}
