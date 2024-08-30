package hw5JavaMethods;

public class FullName {

		public String fullName(String fname, String lname) {
				System.out.println("Family Member: " + fname + "  " + lname);
				return null;
		}

		public static void main(String[] args) {
			
				FullName fName = new FullName();

				fName.fullName("Sapna", "Rani");
				fName.fullName("Debi", "Kunti");
				fName.fullName("Purnota", "Sarker");
				fName.fullName("Rupkotha", "Barman");
		}

}
