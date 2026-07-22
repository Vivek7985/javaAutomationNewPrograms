package hierarchialInheritance;

public class Demo {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		
		d.eat();
		d.bark();
		
		System.out.println("------------------");
		
		Cat c = new Cat();
		
		c.eat();
		c.meow();

	}

}
