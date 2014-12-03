package fall2014.challenge3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MathOnNumbersInString {

	public MathOnNumbersInString() 
	{
	}
		
	public Integer calculate(String input)
	{
		if (input==null || input.isEmpty())
			return null;

		Integer numerator = add(input);
		Integer answer = divide(numerator, input);
		return answer;
	}

	public Integer add(String input)
	{
		try
		{
			Integer amount = new Integer(0);
			
			Pattern p = Pattern.compile("-?\\d+");
			Matcher m = p.matcher(input);
			while (m.find()) {
//				System.out.println(m.group());
				Integer number = Integer.valueOf(m.group());
				amount += number;
			}

			return amount;			
		}
		catch (Exception e)
		{
			return null;
		}
	}
	
	public Integer divide(int numerator, int denominator)
	{
		if (denominator==0)
			return null;
		return (int) Math.ceil((double)numerator/denominator);
	}	

	
	public Integer divide(Integer numerator, String input)
	{
		Integer denominator = input.length();
		return divide(numerator, denominator);
	}	
}
