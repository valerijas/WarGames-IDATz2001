/**
 * @author Valerija Stolare
 */

package no.ntnu.iir.wargames;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * creates enum for the different terrains.
 */
public enum Terrain {
    PLAINS("Plains"),
    FOREST("Forest"),
    HILLS("Hills");
    private final String readableName;
    private static final Map<String, Terrain> terrains = Arrays.stream(Terrain.values()).collect(Collectors.toMap(Terrain::getReadableName, Function.identity()));

    /**
     * creates constructor of the enum
     * @param readableName
     */
    Terrain(String readableName) {
        this.readableName = readableName;
    }

    /**
     * getting enum name
     * @return readableName
     */
    public String getReadableName() {
        return readableName;
    }

}