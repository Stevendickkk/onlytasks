package GameCharacterCW;

public class GameParty {
    public byte countPartyMembers = 0 ;
    public GameCharacter[] partyMembers = new GameCharacter[countPartyMembers];

    public void addCharacter(GameCharacter character ){
        countPartyMembers++;
        partyMembers[countPartyMembers - 1] = character;
        System.out.println("Добавлен новый персонаж: " + countPartyMembers + ". " +character.name + " !");
    }


    public void removeCharacter(String name){
        for (int i = 0; i < countPartyMembers + 1; i++){
            if (name.equals(partyMembers[i].name)){
                countPartyMembers--;
                GameCharacter[] partyMembers = new GameCharacter[countPartyMembers];
                for (int j = 0; j < countPartyMembers; j++) {

                }

            }
        }
    }

    public void useAllSpecialAbilities(){
        for (int i = 0; i < countPartyMembers ; i++) {
            partyMembers[i].useSpecialAbility();
        }
    }

    public void findCharactersByClass(String className){
        for (int i = 0; i < countPartyMembers ; i++) {
            if (partyMembers[i].getClass().equals(className)){
                System.out.println(partyMembers[i].name);
            }
        }
    }

    public void calculatePartyPower(){
        double partyPower = 0;
        for (int i = 0; i <countPartyMembers ; i++) {
            if (partyMembers[i] instanceof Warrior){
                partyPower =+ ((Warrior) partyMembers[i]).strenght;
            }else if (partyMembers[i] instanceof Mage){
                partyPower =+ ((Mage) partyMembers[i]).intelligence;
            }else if (partyMembers[i] instanceof Archer){
                partyPower =+ ((Archer) partyMembers[i]).agility;
            }
        }

        System.out.println("Текущая \"Сила\" (сумма Силы, Интеллекта и Ловкости) = " + partyPower);
    }




}
