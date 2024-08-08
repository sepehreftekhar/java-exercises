//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("sepehr", 80 , 40 , 15);
        Mage mage = new Mage("ali", 90 , 20 , 20);

        warrior.useShield();
        mage.castSpell();

        while (warrior.isAlive() && mage.isAlive()) {
            warrior.attack(mage);
            if (mage.isAlive()) {
                mage.attack(warrior);
            }
        }
        if (warrior.isAlive()) {
            System.out.println(warrior.getName() + " wins!");
        } else if (mage.isAlive()) {
            System.out.println(mage.getName() + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
        }
    }
