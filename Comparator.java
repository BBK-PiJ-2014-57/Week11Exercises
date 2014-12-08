public class Comparator{

	public double getMax(double d1, double d2)
	{
			if(d1>d2)
			{
				return d1;
			}
			else
			{
				return d2;
			}
	}

	public int getMax(int n1, int n2)
	{
		return Math.Round(getMax(n1*1.0, n2*1.0));
	}

	public String getMax(String s1, String s2)
	{
		String toreturn = getMax(Integer.parseInt(s1), Integer.parseInt(s2)).toString();
		return (toreturn);
	}

	public static void main(String[] args)
	{
		Comparator compa = new Comparator();
		System.out.println("The max is: " + compa.getMax(1, 2));
		System.out.println("The max is: " + compa.getMax(1.5, 2.3));
		System.out.println("The max is: " + compa.getMax("1", "3"));
	}
}