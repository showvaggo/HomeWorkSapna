package hw14Abstraction;

public class TestInstitute {
	public static void main(String[] args) {
		ColumbiaUniversity cUniversity = new ColumbiaUniversity();
		cUniversity.anatomyLab();
		cUniversity.anthropology();
		cUniversity.aronauticalSchoolInfo();
		cUniversity.biochemistryLab();
		cUniversity.cafeteria();
		cUniversity.caring();
		cUniversity.chemistry();
		cUniversity.classSize();
		cUniversity.commonRoom();
		cUniversity.computerLab();
		cUniversity.dorm();
		cUniversity.emergencyRoom();
		cUniversity.commonRoom();
		cUniversity.gymnasium();
		cUniversity.hygiene();

//University university= new University
		// University is a Interface.. we can not instantiate Interface.
		University university = new ColumbiaUniversity();
		university.cafeteria();
		university.classSize();
		university.commonRoom();
		university.dorm();
		university.emergencyRoom();
		university.gymnasium();
		university.laboratory();
		university.getClass();
		university.playground();
		university.teacher();

//medicalSchool mSchool=new MedicalSchool
		// medicalSchool is an abstract class.We can not instantiate abstract class.
		MedicalSchool mSchool = new ColumbiaUniversity();
		mSchool.anatomyLab();
		mSchool.anthropology();
		mSchool.biochemistryLab();
		mSchool.hygiene();
		mSchool.getClass();

	}

}
