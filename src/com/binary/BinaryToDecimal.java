package com.binary;


public class BinaryToDecimal
{
	public static void main(String args[])
	{
	
		int findValue = 150;
		BinaryToDecimal magic = new BinaryToDecimal();
		
		String binary = magic.convertBinary(findValue);
		
		System.out.print(Integer.parseInt(binary));
		int binaryValue = Integer.parseInt(binary);
		int fifthValue = magic.convertToMgicPower(binaryValue);
		System.out.print("\n"+fifthValue);
	}

	private String convertBinary(int toBinary)
	{
		String str = "";
		String reverseStr = "";
		while(toBinary > 0)
		{
			str += toBinary % 2;
			toBinary = toBinary/2;
		}
		for(int i = str.length()-1; i >= 0; i--)
		{
			reverseStr += str.charAt(i);
		}
		return reverseStr;
	}
	
	private int convertToMgicPower(int binary)
	{
		int decimal = 0;
		int power = 0;
		while(true)
		{
			if(binary == 0)
				break;
			else
			{
				int temp = binary % 2;
				decimal += temp * Math.pow(2, power);
				binary = binary/10;
				power++;
			}
		}
		return decimal;
	}
}
