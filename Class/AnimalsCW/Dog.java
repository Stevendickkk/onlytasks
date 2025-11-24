package AnimalsCW;

public class Dog extends Animal{

    private String breed;

    public Dog(String name, int age, String breed){
        super(name,age);  //экземпляр класса Animal
        this.breed = breed;
    }


    @Override
    public void makesound(){
        System.out.println(getName() +" гавгав");
    }

    public String getBreed(){
        return breed;
    }


}
