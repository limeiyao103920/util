/**
 * 
 */
package com.limeiyao.common.utils;

import java.math.BigDecimal;
import java.util.Random;


public class NumberUtil {

	//判断字符串是否为数字
	public static boolean isNumber(String str) {
		String reg_num = "^(\\-|\\+)?\\d+(\\.\\d+)?$";
		return str.matches(reg_num);
	}
	
	//获取2位小数的百分数
	public static double getPercent(double num,double total) {
		BigDecimal bigDecimal = new BigDecimal(Double.toString(num / total * 100));
		BigDecimal setScale = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
		return setScale.doubleValue();
	}
	//获得指定区间的随机数   
	public static int random(int min,int max) {
		Random random = new Random();
		int nextInt = random.nextInt(max-min+1);
		if(nextInt<min) {
			return random(min,max);
		}
		return nextInt;
	}
	//获得最小数和最大数之间的多个随机数
	public static int[] random(int min,int max,int num) {
		int[] intArray = new int[num];
		for (int i = 0; i < num; i++) {
			intArray[i] = random(min, max);
		}
		return intArray;
	}
	
}
