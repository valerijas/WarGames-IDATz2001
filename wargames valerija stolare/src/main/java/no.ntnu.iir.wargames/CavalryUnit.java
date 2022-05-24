/**
 * @author Valerija Stolare
 */

package no.ntnu.iir.wargames;

/**
 * creates public class CavalryUnit
 */
public class CavalryUnit extends Unit {

    private int usedAttackBonus = 6;
    private final int MELEE_ATTACK_BONUS = 2;
    private final int RESIST_BONUS = 1;
    private final int PLAINS_BONUS = 5;
    private final int FOREST_BONUS = 0;


    private int numberOfAttacks = 0;
    /**
     * constructing CavalryUit
     *  @param name
     *  @param health
     *  @param attack
     *  @param armor
     */
    public CavalryUnit(String name, int health, int attack, int armor) {
        super(name, health, attack, armor);
    }

    /**
     *creates constructor of a new CavalryUnit
     * has preset values of attack and armor
     * @param name
     * @param health
     */
    public CavalryUnit (String name, int health){super(name, health, 20, 12);}

    /**
     * overrides getAttackBonus from Unit
     * @return attackBonus
     */
    @Override
    public int getAttackBonus() {
        int attackBonus = 0;
        if (numberOfAttacks == 9) {
            attackBonus = 6;
        } else {
            attackBonus = 2;
        }
        numberOfAttacks = numberOfAttacks +1;
        return attackBonus;
    }
    /**
     * overrides getAttackBonus from Unit
     * @param terrain
     * @return attackBonus
     */
    @Override
    public int getAttackBonus(Terrain terrain) {{
        int attackBonus = usedAttackBonus;
        usedAttackBonus = MELEE_ATTACK_BONUS;

        attackBonus += (terrain == Terrain.PLAINS) ? PLAINS_BONUS : 0;
        return attackBonus;
    }

    }
    /**
     * Override getResistBonus from Unit.
     * @return resistBonus
     */
    @Override
    public int getResistBonus() {
        return 1;
    }
    /**
     * Override getResistBonus from Unit
     * @param terrain
     * @return resistBonus
     */
    @Override
    public int getResistBonus(Terrain terrain) {
        return (terrain == Terrain.FOREST) ? FOREST_BONUS : RESIST_BONUS;
    }
}
