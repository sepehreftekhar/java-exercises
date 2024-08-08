public class Warrior extends BaseCharacter{
public Warrior(String name, int health, int attackPower, int defence){
    super(name,health,attackPower,defence);
}
public void useShield(){
    System.out.println(name + " casted a spell that increased their shield");
    defence +=10;
}
}
