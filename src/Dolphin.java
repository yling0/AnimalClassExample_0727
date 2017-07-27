/*
 * All Dolphins are Animals but all Animals are not Dolphins
 */
public class Dolphin extends Animal {
	public Dolphin (){
	//super();
		System.out.println("Now comes a dolphin!");
	}
	
@Override
public String sleep(){
return "A dolphin sleeps...";
}

@Override
public String eat(){
return "A dolphin eats...";
}

public String swim(){
//Dolphin can swim but other animals can't so this method
	//is unique to the Dolphin class
	return "A dolphin is swimming...";
}

public String jump(){
	//Dolphin can jump
		//is unique to the Dolphin class
		return "A dolphin is jumping into the boat...";
	}



	
}
