
/**
 * @author Valerija Stolare
 */

package no.ntnu.iir.wargames;

/**
 * Class creating units
 * @author Ina Folland Hegg
 */

public class UnitCreator {
    /**
     * Creates infantry, ranged, cavalry or commander units
     * @param unitType kind of unit
     * @param name  name of unit
     * @param health health
     * @return unit
     * @throws IllegalArgumentException throw if unit does not exist
     */
    public Unit createUnit(Unit unitType, String name, int health) throws IllegalArgumentException {
        if (unitType == Unit.InfantryUnit) return new InfantryUnit(name, health);
        if (unitType == Unit.RangedUnit) return new RangedUnit(name, health);
        if (unitType == Unit.CavalryUnit) return new CavalryUnit(name, health);
        if (unitType == Unit.CommanderUnit) return new CommanderUnit(name, health);

        throw new IllegalArgumentException("Unit with this name was found");
    }

}