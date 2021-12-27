package com.xworkz.typecasting.casting;

public class ByteCasting {
	byte num=55;
	short short_num =num;
   	int int_num=num;
   	long long_num =num;
   	float float_num=num;
   	double double_num=num;
   	char char_value= (char) num;
	
	public String printAll() {
		return "ByteCasting [num=" + num + ", short_num=" + short_num + ", int_num=" + int_num + ", long_num="
				+ long_num + ", float_num=" + float_num + ", double_num=" + double_num + ", char_value=" + char_value
				+ "]";
	}

}
