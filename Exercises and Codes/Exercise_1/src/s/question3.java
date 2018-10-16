package s;

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

public class question3 
{
	public static void main(String[] args) 
    {
		Date date = new Date();
		String dateformat = new SimpleDateFormat("yyyy-MM-dd HH").format(date);
		String datestring = new SimpleDateFormat("yyyyMMddHH").format(date);
		System.out.println(dateformat+'h');
		System.out.print("现在是"+datestring.substring(0, 4)+"年，");
		switch (datestring.substring(4, 6))
		{	
		case "01":
		case "02":
		case "03":
		case "04":
		case "05":
		case "06":
			System.out.print("上半年，");
			break;
		default:
			System.out.print("下半年，");
			break;
		}
		int month = Integer.parseInt(datestring.substring(4, 6));
	    System.out.printf("%d月", month);
		int days = Integer.parseInt(datestring.substring(6, 8));
		if(days <= 10)
			System.out.printf("上旬");
		else if (days <= 20) 
			System.out.printf("中旬");
		else if (days <= 31) 
			System.out.printf("下旬");
		int hour = Integer.parseInt(datestring.substring(8, 10));
		if(hour >0 && hour <=5)
			System.out.printf("凌晨");
		if(hour >5 && hour <=10)
			System.out.printf("早上");
		if(hour >10 && hour <=12)
			System.out.printf("上午");
		if(hour >12 && hour <= 17)
			System.out.printf("下午");
		if(hour >17 && hour <= 23)
			System.out.printf("晚上");
    }
}
