//This project was made in C++ and is only implemented in Java since Eclipse
//C++/C isn't working in Groovy/Grails Tool Suite
//Made by Paarth Tara
//The C++ code will be up once I get C++ running in Eclipse
//Pet Program Using Inheritance
public class Pet {
	public String name;
	public int age;
	public double height;
	public double weight;
	public enum jobs {NULL};
	//Were probably not going to use this enumeration a lot
	//Add a Person class so we can use these jobs for
	//Virtual human good
	public void Walk(double distance)
	{
		double weight_lost = distance / 75.0;
		//For every 75 miles, the pet loses 1 base unit off its weight
		weight = weight-weight_lost;
		//This is to lower and apply the weight loss double
	}
	public void Feed(double food)
	{
		double weight_gain = distance / 50.0;
		//For every 50 pounds, the pet gains 1 base unit into its weight
		weight = weight+weight_gain;
		//This is to gain and apply the weight gain double
	}
	//This is basically what all simple pets have in common.
}
