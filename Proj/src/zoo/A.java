package zoo;

abstract class Animal 
{
	public abstract void makeNoise();
	public abstract void eat();
	public abstract void roam();

	public void sleep()
	{
		System.out.println("Animal sleeps for 8 hrs");
	}
}
	abstract class Feline extends Animal
	{
		
		public void roam()
		{
			System.out.println("Feline roams");
		}
	}
	class Hippo extends Animal
	{
		public void makeNoise()
		{
			System.out.println("HippoNoise");
			
		}
		public void roam()
		{
			System.out.println("Hippo roams");
		}
		public void eat()
		{
			System.out.println("Eats Hippo food");
		}
		
	}
	abstract class Canine extends Animal
	{
		public void roam()
		{
			System.out.println("Canine roams");
		}
		
	}
	class Lion extends Feline
	{
		public void makeNoise()
		{
			System.out.println("lION SOUND");
		}
		public void eat()
		{
			System.out.println("Eats lion food");
		}
	}
	class Tiger extends Feline
	{
		public void makeNoise()
		{
			System.out.println("Tiger SOUND");
		}
		public void eat()
		{
			System.out.println("Eats tiger food");
		}
	}
	class Cat extends Feline
	{
		public void makeNoise()
		{
			System.out.println("Cat SOUND");
		}
		public void eat()
		{
			System.out.println("Eats cat food");
		}
	}
	class Dog extends Canine
	{
		public void makeNoise()
		{
			System.out.println("Dog SOUND");
		}
		public void eat()
		{
			System.out.println("Eats dog food");
		}
	}
	class Wolf extends Canine
	{
		public void makeNoise()
		{
			System.out.println("Wolf SOUND");
		}
		public void eat()
		{
			System.out.println("Eats wolf food");
		}
	}
	public class A
	{
		public static void main(String[] args)
		{
		  Wolf w=new Wolf();
		  w.makeNoise();
		  w.eat();
		  w.sleep();
		}
	}
	
	
