public class Departament {
    private String departamentName;
    private String headOfDepartament;
    private String officeRoom;
    private String email;
    private String phoneNumber;
    private double budget;
    private static final double UNIVERSITY_BUDGET = 999999999.9;

    private static int totalDepartaments;


    //conc

    public Departament(){
        this("Спортивная кафедра", "Иван Иваныч Иванов", "222", "sportsru@rambler.ru","88005553535",1000000.0);
    }

    public Departament(String departamentName, String headOfDepartament){
        this(departamentName, headOfDepartament, "222", "sportsru@rambler.ru","88005553535",1000000.0);
    }

    public Departament(String departamentName, String headOfDepartament,String officeRoom, String email, String phoneNumber,double budget){
        this.departamentName = departamentName;
        this.headOfDepartament = headOfDepartament;
        this.officeRoom = officeRoom;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.budget = budget;
        totalDepartaments++;
    }

    //methodes

    public void validateEmail(String newemail){
        if (newemail.matches("[a-zA-Z0-9_%+.]+@[a-z0-9-.]{2,}")) {
            email = newemail;
        }else{
            System.out.println("Введите корректный email...");
        }
    }

    public String getEmail(){
        return email;
    }

    public void setBudget(double newBudget){
        if (newBudget < 0){
            budget = 0;
            System.out.println("В казне совсем нет золота, милорд");
        }else{
            budget = newBudget;
        }
    }

    public double getBudget(){
        return budget;
    }

    public void setPhoneNumber(String newPhoneNumber){
        if(newPhoneNumber.matches("8[0-9]{10}")){
            phoneNumber = newPhoneNumber;
        }else{
            System.out.println("Введите корректный телефон...");
        }
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void contact(){
        System.out.println("Контакты: " + email +" " + phoneNumber);
    }

    public void contact(String message){
       contact();
        System.out.println("Сообщение: " + message );
    }

    public void allocateBudget(double amount){
        setBudget((budget - amount));
    }

    public void allocateBudget(double amount,String purpose){
        setBudget((budget - amount));
        System.out.println("денюшки потратили на "+ purpose + ". Осталось: "+ (budget - amount));
    }




}
