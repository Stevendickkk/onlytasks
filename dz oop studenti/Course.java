public class Course {
    private String courseCode;
    private String courseName;
    private int maxStudents;
    private int currentStudents;
    private boolean isActive;
    private static final int MAX_CREDITS_PER_SEMESTER = 30;
    private static int totalCourses;


    //Constr
    public Course(){
        this("00000", "Без названия", 100,0,false);
    }

    public Course(String courseCode, String courseName, int maxStudents){
        this(courseCode, courseName, maxStudents,0,false);
    }

    public Course(String courseCode, String courseName, int maxStudents, int currentStudents, boolean isActive){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.maxStudents = maxStudents;
        this.currentStudents = currentStudents;
        this.isActive = isActive;
        totalCourses++;
    }

    //Meth
    public boolean isValid(){
        return (maxStudents >= currentStudents);
    }


    public void displayInfo(){
        System.out.println("------------------------");
        System.out.println("Код курса: "+ courseCode);
        System.out.println("Название курса: " + courseName);
        System.out.println("Макс. студентов на курсе: " + maxStudents);
        System.out.println("------------------------");
    }

    public void displayInfo(boolean showAvailability){
        if (showAvailability){
        System.out.println("=========================================");
        System.out.println("Код курса: "+ courseCode);
        System.out.println("Название курса: " + courseName);
        System.out.println("Макс. студентов на курсе: " + maxStudents);
        System.out.println("Текущее кол-во студентов на курсе: " + currentStudents);
        System.out.println("Активен ли курс: " + isActive);
        System.out.println("=========================================");
    }else{
            displayInfo();
        }
    }

    public static void calculateWorkload(int credits) {
        int workLoad_hours = (credits * 36 * 45) / 30;
        if (credits >= MAX_CREDITS_PER_SEMESTER) {
            System.out.println("Студент успешно прошел 1 семестр обучения!");
        }
        System.out.println("Общая нагрузка составила: " + workLoad_hours + " ч.");
    }

    public  void  enrollStudent(){
        currentStudents++;
    }

    public void enrollStudent(String idStudent){
        enrollStudent();
        System.out.println("ID студента: "  + idStudent);
        System.out.println("Зачислен!");
    }
    public static int getTotalCourses(){
        System.out.print("Текущее кол-во курсов: ");
        return totalCourses;
    }

}
