//This is the next type of pet
public class Cat extends Pet{
	//This is like the Dog
	//Inherit first 2 comments on Dog and make Dog, Cat
	public void play(Cat friend)
	{
		//Control C Control V the code to here
		//Cats only play with Cats
		System.out.print(name);
		System.out.print(" is playing with ");
		System.out.println(friend.name);
	}
	public void run(Dog predator)
	{
		//Cats run away from dogs
		//Predator, laugh laugh laugh
		System.out.print(name);
		System.out.print(" is trying to run away from ");
		System.out.println(predator.name);
	}
	//Thats basically all for Cat
	//Is predator spelled wrong?
}