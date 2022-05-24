/**
 * @author Valerija Stolare
 */

package no.ntnu.iir.wargames;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 * creating public class Army</Units>
 * @param <Units>
 */
public class Army<Units> {
    private String name;
    private ArrayList<Unit> units;
    private Object object;
    private Random random;

    /**
     * constructing an army
     * @param name
     * @param units
     */
    public Army(String name, List<Unit> units) {
        this.name = name;
        this.units = new ArrayList<>();
    }

    /**
     * setting the name of the army
     * @param name
     */
    public Army(String name) {
        this.name = name;
    }

    /**
     * getting the name of the army
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * adding a unit to the end of this list
     * @param unit
     */
    public void add(Unit unit) {
        this.units.add(unit);
    }


    /**
     * adding all units to list
     * @param units
     */
    public void addAll(List<Unit> units) {
        this.units.addAll(units);
    }

    /**
     * removing the first units from this list
     * @param unit
     */
    public void remove(Unit unit) {
        this.units.remove(unit);
    }

    /**
     * returning the size of collection of units
     * @return size
     */
    public boolean hasUnits() {
        return !units.isEmpty();
    }

    /**
     * returning the list with all units
     * @return list of units
     */
    public List<Unit> getAllUnits() {
        return this.units;
    }

    /**
     * returning a random unit
     * @return Unit
     */
    public Unit getRandom() {
        return this.units.get(this.random.nextInt(this.units.size()));
    }

    /**
     * returning strength by units
     * @return string
     */
    @Override
    public String toString() {
        return "Army{" +
                "name='" + name + '\'' +
                ", units=" + units +
                ", object=" + object +
                ", random=" + random +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Army army = (Army) o;
        return Objects.equals(name, army.name) && Objects.equals(units, army.units);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, units);
    }


    /**
     * returning integer, the health, attack and armor
     * @return integer
     * @return health
     * @return attack
     * @return armor
     */
    public int getCalculatedStrength() {
        return units.stream().mapToInt(s -> s.getAttack() + s.getHealth() + s.getArmor()).sum();

    }

    /**
     * returning the list of ranged units
     * @return list
     */
    public List<Unit> getRangedUnits() {
        return units.stream().filter(n -> n instanceof RangedUnit).toList();
    }

    /**
     * returning the list of cavalry units
     * @return list
     */
    public List<Unit> getCavalryUnits() {
        return units.stream().filter(n -> n instanceof CavalryUnit && !(n instanceof CommanderUnit)).toList();
    }

    /**
     * returning the list of commander units
     * @return list
     */
    public List<Unit> getCommanderUnits() {
        return units.stream().filter(n -> n instanceof CommanderUnit).toList();
    } }


