package io.github.noc.manager.common.util;

import java.math.BigInteger;

/**
 * 数字工具类 
 * @author abeir
 *
 */
public class NumberUtil {
	
	/**
	 * 进制转换
	 * @param number 待转换的数字
	 * @param fromRadix 原进制
	 * @param toRadix 转换进制
	 * @return
	 */
	public static String radixConvert(String number, int fromRadix, int toRadix) {
		BigInteger i = new BigInteger(number, fromRadix);
		return i.toString(toRadix);
	}

	public static void main(String[] args) {
		BigInteger i = new BigInteger("1f", 16);
		
		System.out.println(i.toString(10));
		System.out.println(radixConvert("632014121212325222312345", 10, 36));
	}
}
