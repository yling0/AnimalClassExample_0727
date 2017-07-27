
public class AnimalApp {

	public static void main(String[] args) {

		Animal a = new Animal();
		print(a.eat());
		print(a.sleep());

		Cat c = new Cat();
		print(c.eat());
		print(c.sleep());
		print(c.purr());
		

		Bird b = new Bird();
		print(b.eat());
		print(b.sleep());
		print(b.fly());
		
		Dolphin d = new Dolphin();
		print(d.eat());
		print(d.sleep());
		print(d.swim());
		print(d.jump());
		
		Leopard e = new Leopard();
		print(e.eat());
		print(e.sleep());
		print(e.run());
		print(e.hunt());
		

	}
	private static void print(String s){
		System.out.println(s);
	}
}
