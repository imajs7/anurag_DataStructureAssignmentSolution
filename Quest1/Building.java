package Quest1;

import java.util.ArrayList;
import java.util.List;

public class Building {
	
	private static int numOfFloor;
	
	private List<Integer> q1;
	
	Building(int floors){
		Building.numOfFloor = floors;
		q1 = new ArrayList<Integer>();
	}
	
	public int getFloor() {
		return Building.numOfFloor;
	}
	
	public void saveSize(int size) {
		this.q1.add(size);
	}
	
	public int getValue(int index) {
		return this.q1.get(index);
	}
	
	public void build() {
		int j;
		for( int i = 0; i < this.q1.size(); i++ ) {
			
			j = i + 1;
			
			System.out.print("Day " + j + " : ");
			
			while( getValue(i) == Building.numOfFloor ) {
				System.out.print(this.q1.get(i) + " ");
				Building.numOfFloor--;
				i=0;
			}
			i = j - 1;
			System.out.println();

		}
	}

}
