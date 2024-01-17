package tp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class tstcalcul {
	private ICreditMetier metier ;
	
	@Before
	public void setUp() throws Exception {
		metier = new CreditMetierImp();
	}

	@Test
	public void test() {
		double credit=200000;
		int duree=240;
		double taux =4.5;
		double resultatAttendu =1265.2987;
		double resultatObtenu = metier.calculMensu(credit, taux, duree);
		assertEquals(resultatAttendu, resultatObtenu,0.0001);
		
		//fail("Not yet implemented");
	}

}
