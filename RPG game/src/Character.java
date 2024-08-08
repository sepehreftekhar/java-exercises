public interface Character {
    void attack(Character opponent);
    void defend(int damage);
    boolean isAlive();
    String getName();

}
