import java.util.Scanner;

public class SimpleFan {
	static boolean isReversed = false; // For the direction of the fan.
	static int speed = 1; // To determine the speed of the fan
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("The current speed is "+speed+ " and direction is clockwise");
		
		loop: while(true) {
			
			System.out.println("Enter 1 to change the speed\nEnter 2 for change the direction\nEnter 3 to exit");
			try {
				
				int option = sc.nextInt(); // User input
				switch (option) {
				
				case 1: //(Cord 1)
					pullCord(); // Calls the function to manage the speed of the fan 
					break;
					
				case 2: //(Cord 2)
					isReversed = !isReversed; // Change the direction of fan speed setting				
					System.out.println("The direction is set in "+(isReversed?"anti-clockwise":"clockwise")+"\n");
					break;
					
				case 3:
					break loop;
					
				default: 
					System.err.println("Please choose a correct option\n");
					break;
					
				}
			} catch (Exception e) {
				System.err.println("Please enter a number\n");
				sc.next();
			}
			
		} 
		System.out.println("Bye.....Bye....");
		sc.close();
	}
	
	// Function to manage the speed of the fan
	public static void pullCord() {
		if(isReversed)
			speed = speed==0?3:speed-1;
		else 
			speed = speed==3?0:speed+1;
		
		if(speed==0)
			System.out.println("The fan is turning off....");
		else 
			System.out.println("The SPEED is set to "+speed);
	}

}


