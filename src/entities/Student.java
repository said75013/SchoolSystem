package entities;

public class Student {
    private int id;
    private String name;
    private int age;
    private double note;
    private int listeDesNotes[] = new int[2];


    // Constructeurs
    public Student() {}

    public Student(String name, int age, double note) {
        this.name = name;
        this.age = age;
        this.note = note;
    }

    // Getters / Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getNote() { return note; }
    public void setNote(double note) { this.note = note; }
    public void afficherEtudiant(){
        System.out.println("nom : " + name + ", age : " +age + ", note : "+ note);
    }
    public void remplir_table() {
        listeDesNotes[0] = 10;
        listeDesNotes[1] = 11;
    }
}
