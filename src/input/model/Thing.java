package input.model;

public class Thing
{
	private String name;
	private int age;
	private double weight;
	private int doesnNotMatter;
	
	/**
	 * 
	 */
	public Thing()
	{
		age = -99;
		weight = -.0000005;
		name = "";
	}
	
	/**
	 * 
	 * @param name
	 * @param age
	 * @param weight
	 */
	public Thing(String name, int age, double weight)
	{
		this.age = age;
		this.name = name;
		this.weight = weight;
	}

	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	/**
	 * Returns a String object describing the Thing and its data members.
	 */
	public String toString()
	{
		String thingInfo = name + " is " + age + " years old and weighs " + weight;
		
		return thingInfo;
	}

}
