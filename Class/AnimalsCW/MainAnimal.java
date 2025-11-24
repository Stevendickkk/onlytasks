package AnimalsCW;

public class MainAnimal {
    public static void main(String[] args){

        Animal[] zoo = {
                new Dog("Локи",3, "Той-пудель"),
                new Koshka("Маркиза", 13, 0),
                new Bird("Пингвин",2,false)
        };
        Animal animal = new Dog("Локи",3, "Той-пудель");
        if (animal instanceof Dog){
            Dog dog1 = (Dog) animal;
        }


        for (int i = 0; i < zoo.length; i++) {
            zoo[i].makesound();
            if (zoo[i] instanceof Bird){
                ((Bird) zoo[i]).fly();
            }
        }





    }
}
