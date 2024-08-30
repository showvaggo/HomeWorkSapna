package hw3JavaVariablesDeclared;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe sapna=new AboutMe();//Class Instantiate
		sapna.myName="sapna";
		sapna.myHomeMorgage=5;
		sapna.myGender='F';
		sapna.myHight=6.123f;
		sapna.usCitizen=true;
		sapna.myAge=35;
		sapna.mySalary=5000;
		sapna.myFutureSaving=50000000000000l;
		sapna.myGrade=33.2345678923455556;
		sapna.aboutMe();
		
	AboutMe alex=	new AboutMe();
	alex.myName="Alex";
	alex.myHomeMorgage=5000;
	alex.myGender='M';
	alex.myHight=5.23f;
	alex.usCitizen=true;
	alex.myAge=40;
	alex.mySalary=5000;
	alex.myFutureSaving=40000000000l;
	alex.myGrade=22.54321456;
	alex.aboutMe();
	
		
		
				
	

	}

}
