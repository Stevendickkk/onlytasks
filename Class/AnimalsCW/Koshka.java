package AnimalsCW;

public class Koshka extends Animal{

    private int lives = 9;

    public Koshka(String name, int age, int lives){
        super(name,age);
        this.lives = lives;
    }

    @Override
    public void makesound(){
        System.out.println(getName() +" мяумяу");
    }

    public void climb(){
        System.out.println(getName() + " лазиет по дереву");
    }

}
