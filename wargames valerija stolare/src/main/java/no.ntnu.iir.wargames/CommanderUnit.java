/**
 * @author Valerija Stolare
 */


package no.ntnu.iir.wargames;

/**
 * creating constructor of the class
 * commanderUnit inherits from the CavalryUnit
 */
public class CommanderUnit extends CavalryUnit {
    public CommanderUnit(String name, int health, int attack, int armor) {
        super(name, health, attack, armor);
    }

    /**
     * creating constructor with preset values
     * @param name
     * @param health
     */
    public CommanderUnit (String name, int health){super(name, health, 20, 12);}

}
