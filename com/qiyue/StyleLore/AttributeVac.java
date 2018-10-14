package com.qiyue.StyleLore;

import java.text.DecimalFormat;

import com.qiyue.StyleLore.Utils.Number;

public class AttributeVac {

	public static double get(String s) {
		if(Number.isNum(s.replace("+", "").replace(" ","").replace("%", ""))) {
			return Double.parseDouble(s.replace("+", "").replace(" ","").replace("%", ""));
		} if (s.contains("-")) {
			String test = s;
			double max = 0.0;
			double maz = 0.0;
			test = test.replace(" ", "").replace("%", "").replace("+", "");
			String[] str = test.split("-");
			if(str.length == 2) {
			if(Number.isNum(str[0])) {
				max = Double.parseDouble((str[0]));
			}			
			if(Number.isNum(str[1])) {
				maz = Double.parseDouble(str[1]);
			}
			if(maz > max) {
				double d1 = max;
				double d2 = maz;
				max = d2;
				maz = d1;
			}
			DecimalFormat df=new java.text.DecimalFormat("#.##");   
			return Double.parseDouble(df.format((double)(maz+Math.random()*(max-maz+1))));
			}
		}

		
		return -2.0;
	}
	
}
