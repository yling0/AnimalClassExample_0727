/*
 * All Leopards are Animals but all Animals are not Leopards
 */
public class Leopard extends Animal {
	public Leopard (){
	//super();
		System.out.println("Now I am a Leopard!");
	}
	
	
	
	@Override
	public String sleep(){
	return "A Leopard sleeps...";
	}

	@Override
	public String eat(){
	return "A Leopard eats...";
	}

	public String run(){
		//Leopard can run
		//is unique to the hunt class
	return "A Leopard is running ...";
	}
	
	
	public String hunt(){
		//Leopard can hunt but other animals can't so this method
		//is unique to the hunt class
	return "A Leopard is hunting a deer ...";
	}
	
	
	
}
