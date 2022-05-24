/**
 * @author Valerija Stolare
 */

package no.ntnu.irr.wargames;


// import no.ntnu.irr.wargames.Army;
// import no.ntnu.irr.wargames.Unit;
// import no.ntnu.irr.wargames.CavalryUnit;
// import no.ntnu.irr.wargames.CommanderUnit;
// import no.ntnu.irr.wargames.InfantryUnit;
// import no.ntnu.irr.wargames.RangedUnit;

// import java.util.ArrayList;
// import java.util.List;


//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
//public class ArmyTest {

 //   Army army;

//  @Nested
// public class Unit_constructor_throws_exception {

//  @Test
//  public void name_of_army_can_not_have_whitespace_only() {
//       try {
//          army = new Army("   ");
//         fail();
//     } catch (IllegalArgumentException exception) {
//               assertEquals(exception.getMessage(), "Name can not be empty");
//            }
// }

//         @Test
//         public void unit_list_not_defined_creates_new_unit_arraylist() {
//             army = new Army("Valid name");

//             assertNotNull(army.getAllUnits());
//             assertFalse(army.hasUnits());
//         }

// @Test
//         public void arraylist_with_units_as_parameter_stores_list() {
//             ArrayList<Unit> units = new ArrayList<>();
//             units.add(new InfantryUnit("valid name", 10));

//             army = new Army("Valid name", units);

//             assertTrue(army.hasUnits());
//         }
//     }
