/**
 * @author Valerija Stolare
 */

package no.ntnu.iir.wargames;

/**
 * creates public class InfantryUnit
 */
public class InfantryUnit extends Unit {
    private final int ATTACK_BONUS = 2;
    private final int RESIST_BONUS = 1;
    private final int FOREST_BONUS = 3;

    /**
     * constructing an infantry unit
     * @param name
     * @param health
     * @param attack
     * @param armor
     */
    public InfantryUnit(String name, int health, int attack, int armor) {
        super(name, health, attack, armor);
    }

    /**
     * overrides getAttackBonus from Unit
     * @return attackBonus
     */
    @Override
    public int getAttackBonus() {
        return 0;
    }

    /**
     * creates constructor of a new infantryUnit
     * has preset values of attack and armor
     * @param name
     * @param health
     */
    public InfantryUnit(String name, int health) {
        super(name, health, 15, 10);
    }

    /**
     * overrides getAttackBonus from Unit
     * gives extra bonus if terrain is forest
     * @param terrain
     * @return attackBonus
     */
    @Override
    public int getAttackBonus(Terrain terrain) {
        return (terrain == Terrain.FOREST) ? ATTACK_BONUS + FOREST_BONUS : ATTACK_BONUS;
    }

    /**
     * overrides getAttackBonus from Unit
     * @return attackBonus
     */
    @Override
    public int getResistBonus() {
        return 0;
    }

    //@Override
    //public int getAttackBonus() {
       // return 2;
    //}

    /**
     * overrides getResistBonus from Unit
     * @param terrain
     * @return resistBonus
     */
    @Override
    public int getResistBonus(Terrain terrain) {
        return (terrain == Terrain.FOREST) ? RESIST_BONUS + FOREST_BONUS : RESIST_BONUS;
    }
    //@Override
   // public int getResistBonus() {
       // return 1;
  //  }


}