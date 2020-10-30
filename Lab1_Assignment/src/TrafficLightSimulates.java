/*
 * Author: Nidhi
 * Desc: Simulation of traffic Light
 * Date: 22/10/2020

 */
import java.util.*;
public class TrafficLightSimulates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Traffic Light Simulation\n");
		System.out.println("1.Red\n2.Yellow\n3.Green\nEnter your choice");
		Scanner s=new Scanner(System.in);
		s.close();
		int choice =s.nextInt();
		switch (choice){
		case 1: System.out.println("Stop");
		        break;
		case 2: System.out.println("Ready");
		        break;
		case 3: System.out.println("Go");
		        break;
		default: System.out.println("Enter valid choice");	
			
		}

	}


}


