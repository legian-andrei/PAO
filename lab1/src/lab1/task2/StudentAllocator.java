package lab1.task2;

public class StudentAllocator {
    public static Student[] createStudents(){
        Student[] res = {new Student("Ion", 5),
                        new Student("Andrei", 8),
                        new Student("Mircea", 3),
                        new Student("Ioana", 10),
                        new Student("Maria", 3)};
        return res;
    }
}
