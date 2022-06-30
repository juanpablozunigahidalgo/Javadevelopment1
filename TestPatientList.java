import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
public class TestPatientList {

    //Create a class TestPatientList with a main method.
    //Create 3 objects of patient and add to an ArrayList.

    public static void main(String[] args){

        ArrayList losPacientes = new ArrayList();
        Patient p1 = new Patient(34555,"Edgardo Souza",45);
        Patient p2 = new Patient(34554,"Emiliano Vecchio",23);
        Patient p3 = new Patient(34553,"Federico Inzua",31);

        losPacientes.add(p1);
        losPacientes.add(p2);
        losPacientes.add(p3);

        // Sort the List based on Name which should be the natural order and display using for each loop
        // https://beginnersbook.com/2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator/
        //Sort the List based on Name //
        System.out.println("Patient Name Sorting:");
        Collections.sort(losPacientes, Patient.PatientNameComparator);

        for(Object str: losPacientes){
            System.out.println(str);
        }

        /* Sorting on Age property*/
        System.out.println("Age Sorting:");
        Collections.sort(losPacientes, Patient.AgeComparator);
        for(Object str: losPacientes){
            System.out.println(str);
        }


    }

    // Sort the List based on age which should be the alternate sorting order and display using Iterator

}
