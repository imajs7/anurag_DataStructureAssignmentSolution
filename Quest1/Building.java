package Quest1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Building {
	
	private int numOfFloor;
	private Stack<Integer> stack = new Stack<Integer>();
	private Queue<Integer> queue = new LinkedList<Integer>();
	
	Building(int floors){
		this.numOfFloor = floors;
	}
	
	public int getFloors() {
		return this.numOfFloor;
	}
	
	public void add(int data) {
		this.queue.add(data);
	}
	
	// main building logic from question
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
				sortedPush( queue.remove() );
			}
			
			System.out.println();
			day++;
			
		}
		
	}
	
	// build a sorted stack of on-hold floor size
	private void sortedPush(int data) {
		
		Stack<Integer> temp = new Stack<Integer>();
		
		while( ! this.stack.isEmpty() && this.stack.peek() > data ) {
			temp.push( this.stack.pop() );
		}				
			
		temp.push(data);
		
		while( ! temp.isEmpty() ) {
			this.stack.push( temp.pop() );
		}
		
	}

}
