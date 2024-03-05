package lab1.task2;
import java.util.Random;

public class Course {
    private String name;
    private double minimumGrade;
    private Student[] students;

    public Course(String name, double minimumGrade, Student[] students) {
        this.name = name;
        this.minimumGrade = minimumGrade;
        this.students = students;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getMinimumGrade() {
        return minimumGrade;
    }
    public void setMinimumGrade(double minimumGrade) {
        this.minimumGrade = minimumGrade;
    }

    public Student[] getStudents() {
        return students;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }


    public Student chooseStudentRandomly(){
        Random rand = new Random();
        return students[rand.nextInt(students.length)];
    }
    public boolean isStudentPassing(int idStudent){
        if (students[idStudent].getGrade() >= this.minimumGrade){
            return true;
        } else {
            return false;
        }
    }
    public boolean isStudentPassing(Student student){
        if (student.getGrade() >= this.minimumGrade){
            return true;
        } else {
            return false;
        }
    }
    public Student[] showAllPassingStudents(){
        Student[] res = new Student[this.students.length];
        int cont = 0;
        for (Student s : this.students){
            if (isStudentPassing(s)){
                res[cont] = s;
                cont++;
            }
        }
        return res;
    }
}
