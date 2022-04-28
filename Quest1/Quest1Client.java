package Quest1;

import java.util.Scanner;

public class Quest1Client {
	
	/*
	 * Building a skyscraper of distinct floor size
	 * each day a floor of distinct size is built
	 * larger floor size must be placed below smaller
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the total no of floors in the building: ");
		Building skyscraper = new Building( input.nextInt() );
		
		for(int i = 1; i <= skyscraper.getFloors(); i++) {
			System.out.printf("Enter the floor size given on day %d: ", i);
			skyscraper.add( input.nextInt() );
		}
		
		skyscraper.build();
		
		input.close();

	}

}
