public class Mage extends BaseCharacter{
    public Mage(String name, int health, int attackPower, int defence){
        super(name,health,attackPower,defence);
    }
    public void castSpell(){
        System.out.println(name + " casted a spell that increasedd their attack");
        attackPower +=10;
    }
}
