package hw10UseSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("......default constructor initialized from the Father class.......");

		Father father = new Father();

		Father father2 = new Father("Showvaggo", 95, 'M', true);
		System.out.println("\n.......parameterized constructor initialized from the Father class......");

		father.father();
		System.out.println("\n.......void type method initialized from the Father class......");

		father.fatherInfo("Showvaggo", 95, 'M', true);
		System.out.println("\n.......parameterized type method initialized from the Father class......");

		System.out.println("\n......default constructor initialized from the Doughter class.......");

		System.out.println("\n......default constructor initialized from the Daughter class.......");
		Daughter daughter = new Daughter();

		System.out.println("\n......parameterized constructor initialized from the Daughter class.......");
		Daughter daughter1 = new Daughter("Tweety:August 22", 60);

		System.out.println("\n.......parameterized type method initialized from the daughter class......");
		daughter.daughterInfo("Sweety : july,6", 55);

		System.out.println("\n.......void type method initialized from the daughter class......");
		daughter.daughter();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
	
		
	}

}
