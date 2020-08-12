package animals;

public class AnimalApp implements Animal {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		cat.voice();
		dog.voice();
	}

	@Override
	public void voice() {
		// TODO Auto-generated method stub
		
	}

}
