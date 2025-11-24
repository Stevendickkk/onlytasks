import java.util.Scanner;

public class Student {
    private static Scanner sc = new Scanner(System.in);
    private static int totalStudents;
    private static final String UNIVERSITY_NAME = "Казанский Федеральный Университет";
    private String studentId; //id
    private String firstName; //Имя
    private String lastName; //Фамилия
    private int age; //Возраст
    private  double averageGrade; //Средний балл
    private String faculty; //Факультет


//constr
    public Student(){
        this("0", "Нет имени" ,"Нет фамилии", 18, 0.0, "Нет факультета");
    }

    public Student(String studentId,  String firstName, String lastName){
        this(studentId, firstName ,lastName, 18, 0.0, "Нет факультета");
    }


    public Student(String studentId, String firstName, String lastName, int age,double averageGrade,String faculty){
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averageGrade = averageGrade;
        this.faculty = faculty;
        totalStudents++;
    }


//meth
    public void displayInfo(){
        System.out.println("-------------------------------");
        System.out.println("Номер студ. билета студента: " + this.studentId);
        System.out.println("Имя студента: " +  this.firstName);
        System.out.println("Фамилия студента: " + this.lastName);
        System.out.println("-------------------------------");
    }

    public void displayInfo(boolean detailed){
        if (detailed){
        System.out.println("============================================");
        System.out.println("Номер студ. билета студента: " + this.studentId);
        System.out.println("Имя студента: " +  this.firstName);
        System.out.println("Фамилия студента: " + this.lastName);
        System.out.println("Возраст студента: " +  this.age);
        System.out.println("Средний балл студента: " +  this.averageGrade);
        System.out.println("Факультет студента: " +  this.faculty);
        System.out.println("============================================");
    }else{
            displayInfo();
        }
            }

    public static int getTotalStudents(){
        System.out.print("Текущее кол-во студентов: ");
        return totalStudents;
    }



    public void setAge(int newAge){
        while (newAge < 16 && newAge > 70){
            System.out.println("Введите корректный возраст...");
            newAge = sc.nextInt();
        }
        age = newAge;
    }

    public int getAge(){
        return age;
    }

    public void setAverageGrade(double newAverageGrade){
        while (newAverageGrade < 0.0 && newAverageGrade > 5.0){
            System.out.println("Введите корректный средний балл...");
            averageGrade = sc.nextFloat();
        }
        averageGrade = newAverageGrade;
    }

    public double getAverageGrade(){
        return averageGrade;
    }

    public void updateGrade(double newGrade){
        setAverageGrade(newGrade);
    }

    public void updateGrade(double newGrade, String subject){
        updateGrade(newGrade);
        System.out.println("Cредний балл по дисциплине " + subject + ":" + newGrade );
    }


    public void setStudentId(String newStudentId){
        while (newStudentId != ""){
            System.out.println("Введите корректный ID студента...");
            newStudentId = sc.nextLine();
        }
        studentId = newStudentId;
    }

    public String getStudentId() {
        return studentId;
    }
}
