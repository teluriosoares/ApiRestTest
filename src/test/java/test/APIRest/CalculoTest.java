package test.APIRest;

import junit.framework.TestCase;


public class CalculoTest extends TestCase {

	public void testExeCalculo() {
		float valor01 = 15;
		float valor02 = 50;
		float ReturnWait = 65;
		
		float ReturnCalc = App.ExeCalculo(valor01,valor02);
		assertEquals (ReturnWait,ReturnCalc,0);
		
	}
}
