package Quest1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Building {
	
	int numOfFloor;
	Stack<Integer> stack = new Stack<Integer>();
	Queue<Integer> queue = new LinkedList<Integer>();
	
	Building(int floors){
		this.numOfFloor = floors;
	}
	
	public void build() {
		
		int floor = this.numOfFloor;
		int day = 1;
		
		while(day <= this.numOfFloor) {
			
			System.out.print("Day " + day + " : ");
			
			if(queue.peek() == floor) {
				System.out.print( queue.remove() + " " );
				floor--;
				while( ! stack.isEmpty() && stack.peek() == floor ) {
					System.out.print( stack.pop() + " " );
					floor--;
				}
			} else {
				stack.push( queue.remove() );
			}
			
			System.out.println();
			day++;
			
		}
		
	}
	
	

}
