public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String studentName, int studentAge, double studentGrade) {
        name = studentName;
        age = studentAge;
        grade = studentGrade;
    }

    public void introduce() {
        System.out.println("Hi, my name is " + name + ", I am " + age + " years old, and my grade average is " + grade + ".");
    }

}
