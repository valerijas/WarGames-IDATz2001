/**
 * @author Valerija Stolare
 */



package no.ntnu.iir.wargames;


/**
 * creating public class Battle
 * simulating battles between two armies
 */
public class Battle {
    private Army armyOne;
    private Army armyTwo;

    /**
     * creating two armes
     */
    public Battle(Army armyOne, Army armyTwo) {
        this.armyOne = armyOne;
        this.armyTwo = armyTwo;
    }

    public Army dummyInitializer(String armyName) {
        Army army = new Army(armyName);
        for (int i = 1; i <= 10; i++) {
            army.add(new CavalryUnit(" Giants ", 100));
            army.add(new CommanderUnit(" Trolls ", 100));
            army.add(new InfantryUnit(" Dragons ", 100));
            army.add(new RangedUnit(" Gorillas ", 100));
        }
        return army;
    }

    /**
     * creates the simulation of a battle
     * @return
     */
    public Army simulate() {
        armyOne = dummyInitializer("Army One");
        armyTwo = dummyInitializer("Army two");

        boolean battleover = false;
        while (!battleover) {
            Unit unit = armyOne.getRandom();
            Unit opponent = armyTwo.getRandom();
            unit.getAttack();
            opponent.getAttack();
            if (unit.getHealth() == 0) {
                armyOne.remove(armyOne.getRandom());
                System.out.println("Removing an unit from army one. Units left: "
                        + armyOne.getAllUnits().size());

            }
            if (opponent.getHealth() == 0) {
                armyTwo.remove(armyTwo.getRandom());
                System.out.println("Removing an unit from army one. Units left in army two: " +
                        armyTwo.getAllUnits().size());
                if (!armyOne.hasUnits() || !armyTwo.hasUnits()) {
                    battleover = true;
                }
                if (armyOne.hasUnits()) {
                    System.out.println("Game over. The winner is " + armyOne.getName());
                }
                if (armyTwo.hasUnits()) {
                    System.out.println("Game over. The winner is " + armyTwo.getName());
                }


                // public static void Unit {
                //   Battle battle = new Battle();
                //  battle.dummyInitializer();
                //  battle.simulate();}


            }


        }


        return null;
    }
}

    //@Override
  //  public String toString() {
      //  return "Battle{" +
           //     "armyOne=" + armyOne +
            //    ", armyTwo=" + armyTwo +
           //     '}';
  //  }

