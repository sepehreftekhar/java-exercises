public class BaseCharacter implements Character{

    protected String name;
    protected int health;
    protected int attackPower;
    protected int defence;

    public BaseCharacter(String name, int health, int attackPower, int defense) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defence = defense;
    }

    public void attack(Character opponent) {
        System.out.println(name +" attacks " + opponent.getName() + " with "+ attackPower+ " attack power");
        //**
        opponent.defend(attackPower);
    }

    public void defend(int damage) {
        int damgeCaused = damage - defence;
        if (damgeCaused > 0) {
            health -= damgeCaused;
            if(health > 0){
                System.out.println(name + " received " + damgeCaused + " damage and their Health is now " + health);
            }else if(health <= 0){
                System.out.println(name + " lost the game!");
            }

        } else {
            System.out.println(name + " blocks the attack.");
        }
    }

    public boolean isAlive() {
        return health >= 0;
    }
    
    public String getName() {
        return name;
    }
}

