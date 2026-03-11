import entities.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private String temps;

    public static void main(String[] args) {
        int mohamedAge;
        Student student2 = new Student();
        student2.setName("Mohamed");

        student2.setAge(20);
//        student2.age=20

//        student1.note = 12.50;

        student2.afficherEtudiant();

        Student student3 = new Student("Yassin", 22, 18);
        student3.remplir_table();

        System.out.println("Name : " + student3.getName()); // Name : Yassin

        mohamedAge = student2.getAge();

        System.out.println("L age de mohamed est : " + mohamedAge);
    }
}