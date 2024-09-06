package modules;

public class Dog {
	
	public Boolean isBullDog;
	
	public int age;

	public Dog(Boolean isBullDog, int age) {
		this.isBullDog = isBullDog;
		this.age = age;
	}

	public Boolean getIsBullDog() {
		return isBullDog;
	}

	public void setIsBullDog(Boolean isBullDog) {
		this.isBullDog = isBullDog;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	public void dogInfo() {
		System.out.print("Is Bulldog? " + isBullDog + "\n");
		System.out.print("Age: " + age);
	}
	
	
	
}
