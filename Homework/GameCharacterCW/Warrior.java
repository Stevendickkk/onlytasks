package GameCharacterCW;

public class Warrior extends GameCharacter {
    protected double strenght;
    private double armor;
    private String weaponType;

    public Warrior(String name,int level, double health, double mana, boolean isAlive, double strenght, double armor, String weaponType){
        super(name, level,  health,  mana,  isAlive);
        this.strenght = strenght;
        this.armor = armor;
        this.weaponType =weaponType;
    }

    @Override
    public void displayInfo(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Имя: " + name);
        System.out.println("Уровень: " + level);
        System.out.println("Здоровье: " + health);
        System.out.println("Мана: " + mana);
        System.out.println("Жив ли персонаж: " + isAlive);
        System.out.println("Сила: " + strenght);
        System.out.println("Броня: " + armor);
        System.out.println("Тип оружия: " + weaponType);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
    }

    @Override
    public void useSpecialAbility(){
        System.out.println(getName() + ": Я ХОЧУ БЫТЬ СЧАСТЛИВЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫМ!!!!!!!!!!!!!");
    }

    public void attack(String weaponType){
        System.out.println(getName() + ": нЫЫЫЫЫЫЫЫЫЫЫААААА");
        System.out.println("Использовано оружие: " + weaponType);
    }

}
