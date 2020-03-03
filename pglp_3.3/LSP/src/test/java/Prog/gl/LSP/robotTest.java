package Prog.gl.LSP;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class robotTest {
	
	@Test
	public void avanceTest() {
		//robotStatique rs = new robotStatique(80);
		robotType1 r1 = new robotType1(80);
		robotType2 r2 = new robotType2(80);
		
		ArrayList<robot> R = new ArrayList<robot>();
		R.add(r2);
		R.add(r1);
		//R.add(rs);
		
		for (int i = 0 ; i < R.size() ; i++) {
			R.get(i).avance();
		}
		
		assertTrue(r1.getPosition() == 85 && r2.getPosition() == 90 );
	}

}
