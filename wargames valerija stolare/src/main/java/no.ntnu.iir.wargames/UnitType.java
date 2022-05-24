/**
 * @author Valerija Stolare
 */

package no.ntnu.iir.wargames;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * creating
 * with all the unit types
 */
public enum UnitType {
    INFANTRY_UNIT(" InfantryUnit "),
    RANGED_UNIT(" RangedUnit "),
    CAVALRY_UNIT(" CavalryUnit "),
    COMMANDER_UNIT(" CommanderUnit ");
    private final String className;
    private static final Map<String, UnitType> unitTypes = Arrays.stream(UnitType.values())
            .collect(Collectors.toMap(UnitType::getClassName, Function.identity()));

    /**
     * creating constructor of enum
     * @param className
     */
    UnitType(String className) {
        this.className = className;
    }

    /**
     * getting class name
     * @return className
     */
    public String getClassName() {
        return className;
    }

    /**
     * getting unit type.
     * @param readableName
     * @return UnitType string, name of unit
     */
    public static UnitType getUnitType(String readableName) {
        return unitTypes.getOrDefault(readableName, null);
    }
}

