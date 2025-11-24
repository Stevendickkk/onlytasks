package GameCharacterCW;

public class GameCharacter {
    protected String name;
    protected int level;
    protected double health;
    protected double mana;
    protected boolean isAlive;
    private static int totalCharacters;
    private static final int MAX_LEVEL = 100;

    //c
    public GameCharacter(){
        this("Bob",1,100.0,100.0,true);
    }

    public GameCharacter(String name,int level, double health, double mana, boolean isAlive){
        this.name = name;
        this.level =  level;
        this.health = health;
        this.mana = mana;
        this.isAlive = isAlive;
        totalCharacters++;
    }

    //m
    public void displayInfo(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Имя: " + name);
        System.out.println("Уровень: " + level);
        System.out.println("Здоровье: " + health);
        System.out.println("Мана: " + mana);
        System.out.println("Жив ли персонаж: " + isAlive);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public String getName(){
        return name;
    }

    public void useSpecialAbility(){
        System.out.println(getName() + ": АДАВА КЕДАВРА!!!1!!!!11!");
    }

    public void attack(){
        System.out.println(getName()+ ": НЫААААААААААААА");
    }

    public void takeDamage(double damage){
        if (damage > health){
            health = 0;
            isAlive = false;
            System.out.println(getName() + " умер. ну все.");
        }else {
            health -= damage;
            System.out.println(getName() + "АЙ Б**...");
            System.out.println("Получено " + damage + " урона.");
        }
    }

    public void heal(double heal){
        if (!isAlive){
            System.out.println(getName() + " мертв. Его поздно хилить.");
        }else {
            health += heal;
            System.out.println(getName() + "ОДА СЮДААААААААААА");
            System.out.println("Выхелено " + heal + " здоровья");
        }
    }

    public void getTotalCharacters(){
        System.out.println("Всего героев:" + totalCharacters);
    }

}
