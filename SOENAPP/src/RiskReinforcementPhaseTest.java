import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 * The Junit Test Classclass defines number of the armies given to the player calculation.
 * In the reinforcements phase, the player is given a number of armies that depends on the 
 * number of countries he owns (# of countries owned divided by 3, rounded down). 
 * If the player owns all the countries of an entire continent
 * else the player is given an amount of armies corresponding to the continent’s control value.
 * 
 * @author Neha
 * @version 1.0
 *
 */
class RiskReinforcementPhaseTest {

	@Test
	void testArmyCalculationPerPlayer() {
		System.out.println("Calculation of the Reinforcement for first case");
		assertEquals(2,RiskReinforcementPhase.armyCalculationPerPlayer(1,4, 2, 10));
		
		System.out.println("Calculation of the Reinforcement for Continent Control Value");
		assertEquals(4,RiskReinforcementPhase.armyCalculationPerPlayer(1,4, 2, 4));
	}

	@Test
	void testCardExchangeView() {
		fail("Not yet implemented");
	}

}
