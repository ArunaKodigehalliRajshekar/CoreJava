package com.xworkz.typecasting;

public class IntCasting {
	
	byte num4=55;
	short short_num4 =num4;
   	int int_num4=num4;
   	long long_num4 =num4;
   	float float_num4=num4;
   	double double_num4=num4;
   	char char_value4= (char) num4;
	
	public String printAll4() {
		return "ByteCasting [num=" + num4 + ", short_num4=" + short_num4 + ", int_num4=" + int_num4 + ", long_num4="
				+ long_num4 + ", float_num4=" + float_num4 + ", double_num4=" + double_num4 + ", char_value4=" + char_value4
				+ "]";
	}
	
	short num5 =266;
   	byte byte_num5=(byte)num5;
   	int int_num5 =num5;
   	float float_num5=num5;
   	double double_num5 =num5;
   	long long_value5 =num5;
   	char char_value5=(char)num5;


	public String printAll5() {
		return "ShortCasting [num5=" + num5 + ", byte_num5=" + byte_num5 + ", int_num5=" + int_num5 + ", float_num5="
				+ float_num5 + ", double_num5=" + double_num5 + ", long_value5=" + long_value5 + ", char_value5="
				+ char_value5 + "]";
	}


	
	int num =52888;
	byte byte_num =(byte)num;
	short short_num =(short)num;
	long long_value=num;
	float float_value=num;
	double double_value=num;
	char char_value=(char)num;
	
	public String printAll() {
		return "IntCasting [num=" + num + ", byte_num=" + byte_num + ", short_num=" + short_num + ", long_value="
				+ long_value + ", float_value=" + float_value + ", double_value=" + double_value + ", char_value="
				+ char_value + "]";
	}
	
	long num1=8550071423l;
	byte byte_value= (byte)num1;
	short short_value =(short)num1;
	int int_value1 = (int)num1;
	float float_value1 =num1;
	double double_value1 =num1;
	char char_value1 =(char)num1;

	
	public String printAll1() {
		return "LongCasting [num1=" + num1 + ", byte_value=" + byte_value + ", short_value=" + short_value
				+ ", int_value1=" + int_value1 + ", float_value1=" + float_value1 + ", double_value1=" + double_value1
				+ ", char_value1=" + char_value1 + "]";
	}
	
	
	float num2= 816.68f;
	byte byte_value2 = (byte)num2;
	short short_value2 =(short)num2;
	int int_value2 =(int) num2;
	long long_value2 = (long)num2;
	double double_value2 =num2;
	char char_value2 =(char)num2;

	
	public String printAll2() {
		return "FloatCasting [num2=" + num2 + ", byte_value2=" + byte_value2 + ", short_value2=" + short_value2
				+ ", int_value2=" + int_value2 + ", long_value2=" + long_value2 + ", double_value2=" + double_value2
				+ ", char_value2=" + char_value2 + "]";
	}
	
	
	double num3=775826.879;
	byte byte_value3=(byte)num3;
	short short_value3=(short)num3;
	int int_value3=(int)num3;
	long long_value3=(long)num3;
	float float_value3 =(float)num3;
	char char_value3=(char)num3;

	
	public String printAll3() {
		return "doubleCasting [num3=" + num3 + ", byte_value3=" + byte_value3 + ", short_value3=" + short_value3
				+ ", int_value3=" + int_value3 + ", long_value3=" + long_value3 + ", float_value3=" + float_value3
				+ ", char_value3=" + char_value3 + "]";
	}
	
	char ch ='m';
	byte byte_value6 =(byte)ch;
	short short_value6 =(short)ch;
	int int_short6 =(int)ch;
	long long_value6 =(long)ch;
	float float_value6 =ch;
	double double_value6 =ch;
	

	
	public String toString() {
		return "CharCasting [ch=" + ch + ", byte_value6=" + byte_value6 + ", short_value6=" + short_value6
				+ ", int_short6=" + int_short6 + ", long_value6=" + long_value6 + ", float_value6=" + float_value6
				+ ", double_value6=" + double_value6 + "]";
	}
	


}
