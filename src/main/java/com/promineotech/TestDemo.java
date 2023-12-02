package com.promineotech;

import java.util.Random;

public class TestDemo {
	public int addPositive(int a, int b) {
			if (a > 0 && b > 0) 
				return a + b;
			else if (a <=0 || b <=0){
				throw new IllegalArgumentException("Both parameters must be positive!");
			} else {
				return 0;
			}
		
	}
	
	/** Step 3: Check to see if the number passed is even
	 * 
	 * @param a
	 * @return
	 */
	public boolean isEven(int a) {
		return a % 2 == 0;
	}
	
	/**
	 * Step 4: 
	 * @return
	 */
	public int randomNumberSquared() {
		int result = getRandomInt();
		return result * result;
	}
	
	int getRandomInt() {
	    Random random = new Random();
	    return random.nextInt(10) + 1;

	}
}
