public class MainStudent {
    public static void main(String[] args) {
        Student student0 = new Student("11111", "Иван", "Краснов", 18, 3.3, "ИТИС");
        Student student1 = new Student();

        Course course0 = new Course();

        Departament dep0 = new Departament();

        dep0.allocateBudget(100, "мама");

//        course0.displayInfo();
//
//        System.out.println(Course.getTotalCourses());
//
//        System.out.println(student0.getTotalStudents());
    }
}
