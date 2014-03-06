package camion;

import static org.junit.Assert.*;

import org.junit.Test;

public class CamionTest {

	
	@Test
	public void testGetPesoTotal() {
		Camion cam = new Camion("4532-GDH", "Mercedes B3", 260.0, null);
		//assertEquals(cam.getPesoTotal());
	}

	@Test
	public void testAddCaja() {
		fail("Not yet implemented");
	}

}
