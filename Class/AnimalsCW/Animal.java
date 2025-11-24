package AnimalsCW;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }



    public void eat(){
        System.out.println(name +" кушает ням-ням");
    }

    public void sleep(){
        System.out.println(name + " спит zzzZZZzzz");
    }

    public void makesound(){
        System.out.println(name + "ыыы");
    }

    public String getName(){
        return name;
    }



}
