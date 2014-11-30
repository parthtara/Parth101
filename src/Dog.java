//Dog
public class Dog extends Pet{
	//Dog inherits Pet to become a type of pet
	public void play(Dog friend)
	{
		//Dogs only play with Dogs
		System.out.print(name);
		System.out.print(" is playing with ");
		System.out.println(friend.name);
	}
	public void chase(Cat enemy)
	{
		//Dogs only chase Cats
		System.out.print(name);
		System.out.print(" is chasing ");
		System.out.println(enemy.name);
	}
	//2 things a cat can't do with itself
	//We have to add a new play void in Cat
}
