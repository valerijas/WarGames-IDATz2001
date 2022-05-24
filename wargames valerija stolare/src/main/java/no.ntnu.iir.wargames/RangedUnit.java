/**
 * @author Valerija Stolare
 */

package no.ntnu.iir.wargames;

public class RangedUnit extends Unit {

    private final int ATTACK_BONUS = 3;
    private final int INITIAL_RESIST_BONUS = 6;
    private final int FINAL_RESIST_BONUS = 2;
    private final int HILL_BONUS = 3;
    private final int FOREST_PENALTY = 2;
    private int timesResisted = 0;


    private int numberOfAttackRecived = 0;

    /**
     * constructing a ranged unit
     * @param name
     * @param health
     * @param attack
     * @param armor
     */
    public RangedUnit(String name, int health, int attack, int armor) {
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
     *creates constructor of a new rangedUnit
     * has preset values of attack and armor
     * @param name
     * @param health
     */
    public RangedUnit (String name, int health){super(name, health,
            15, 8);}

    //@Override
    //public int getAttackBonus() {
        //return 3;
    //}

    /**
     * overrides getAttackBonus from Unit
     * gives extra bonus for different terrains
     * @param terrain
     * @return attackBonus
     */
    @Override
    public int getAttackBonus(Terrain terrain) {
        int attackBonus = ATTACK_BONUS;
        if (terrain == Terrain.HILLS) attackBonus += HILL_BONUS;
        if (terrain == Terrain.FOREST) attackBonus -= FOREST_PENALTY;
        return attackBonus;
    }

    /**
     * overrides getResistBonus from Unit
     * @return resistBonus
     */
    @Override
    public int getResistBonus() {
        return 0;
    }

    // @Override
    //public int getResistBonus() {
     //   int resistBonus;
       // switch (numberOfAttackRecived) {
        //    case 0:
         //       resistBonus = 6;
         //       break;
         //   case 1:
          //      resistBonus = 4;
          //      break;
          //  default:
           //     resistBonus = 2;
      //  }
       // numberOfAttackRecived = numberOfAttackRecived + 1;
       // return resistBonus;

   // }

    /**
     * Override getResistBonus from Unit
     * @param terrain
     * @return resistBonus
     */
    @Override
    public int getResistBonus(Terrain terrain) {
        int resistBonus = timesResisted >= 2 ? FINAL_RESIST_BONUS : INITIAL_RESIST_BONUS - 2 * timesResisted;
        timesResisted++;
        return resistBonus;
    }
}
