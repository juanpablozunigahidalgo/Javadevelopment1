import java.util.*;
import java.util.Comparator;
public class Patient {

    //Instruction for the Patient class.
    //Create a class Patient with private instance variables.
    //patientId (int), name(String) and age(int).
    //Include parameterized Constructor and Getters/Setters.

    // Here the private instance variables.

    private int patientId;
    private String name;
    private int age;

    // Parametrized Constructor

    // First. A universal constructor is written. To avoid compilation error.
    public Patient(){

    }
    //Then a parametrized constructor.
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }


    // Getters And Settlers
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Comparator<Patient> PatientNameComparator = new Comparator<Patient>() {

        public int compare(Patient pp1, Patient pp2) {
            String patientName1 = pp1.getName().toUpperCase();
            String patientName2 = pp2.getName().toUpperCase();

            //ascending order
            return patientName1.compareTo(patientName2);

            //descending order
            //return StudentName2.compareTo(StudentName1);
        }};
    public static Comparator<Patient> AgeComparator = new Comparator<Patient>() {

        public int compare(Patient pp1, Patient pp2) {

            int agep1 = pp1.getAge();
            int agep2 = pp2.getAge();

            /*For ascending order*/
            return agep1-agep2;

            /*For descending order*/
            //agep1-agep2;
        }};
    @Override
    public String toString() {
        return "[ patientId=" + patientId + ", name=" + name + ", age=" + age + "]";
    }
}
