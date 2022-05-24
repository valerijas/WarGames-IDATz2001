/**
 * @author Valerija Stolare
 */


package no.ntnu.iir.wargames;

/**
 * creates the abstract class Unit
 */
public abstract class Unit {
    public static Unit InfantryUnit;
    public static Unit RangedUnit;
    public static Unit CavalryUnit;
    public static Unit CommanderUnit;
    private String name;
    private int health;
    private int attack;
    private int armor;

    public Unit(String name, int health, int attack, int armor) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.armor = armor;
    }

    public void attackOpponent(Unit opponent) {
        int oppponentsNewHealth = opponent.getHealth() - (this.attack+this.getAttackBonus()) + (opponent.getArmor()+opponent.getResistBonus());
        opponent.setHealth(oppponentsNewHealth);
    }

    /**
     * getting name of unit
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * getting health of unit
     * @return health
     */
    public int getHealth() {
        return this.health;
    }

/**
 * getting attack of unit
 * @return attack
 */
    public int getAttack() {
        return this.attack;
    }

    /**
     * getting armor of unit
     * @return armor
     */
    public int getArmor() {
        return this.armor;
    }

    /**
     * getting health of unit
     * @return health
     */
    public void setHealth(int newHealth) {
        this.health = newHealth;
    }
/**
    * getting attack bonus
     * @return attackBonus
 */
    public abstract int getAttackBonus();

    /**
     * getting attack bonus
     * @param terrain
     * @return attackBonus
     */
    public abstract int getAttackBonus(Terrain terrain);

    /**
     * getting resist bonus
     * @return resistBonus
     */
    public abstract int getResistBonus();

    /**
     * getting resist bonus
     * @param terrain
     * @return resistBonus
     */
    public abstract int getResistBonus(Terrain terrain);
}
