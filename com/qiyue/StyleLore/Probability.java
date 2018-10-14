package com.qiyue.StyleLore;

public class Probability {

	public static boolean of(double vau) {
		
		int random = (int)(1+Math.random()*(100-1+1));
		
		double randoms = random / 100.0;
		
		vau = vau / 100.0;
		
		if( vau >= randoms ){
			return true;
		}
		else{
			return false;
			   }
	}
	
}
