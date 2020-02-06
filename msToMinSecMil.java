package randomWord;

import java.util.Scanner;

/**
 * 
 * @author jrbas
 * calculate given milliseconds into minutes, seconds and milliseconds
 */
public class msToMinSecMil {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double time = input.nextInt();
		//System.out.println("The input is " + time);
		double minutes = Math.floor(time * 0.0001 / 6);
		time = time % (minutes * 60000);
		System.out.println(minutes + " minute(s)");
		//System.out.println("time left to calc = " + time);
		double seconds = Math.floor(time * 0.001);
		time = time % (seconds * 1000);
		System.out.println(seconds + " second(s)");
		//System.out.println("time left to calc = " + time);
		double milliseconds = time;
		time = time % time; // :p
		System.out.println(milliseconds + " millisecond(s)");
		//System.out.println("time left to calc = " + time);

	}

}
