package kr.ac.gnu.anse.calc;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class CalcTest {
   @Test
   public void testAdd(){
	   Calc c=new Calc();
	   assertEquals(30, c.add(10, 20));
   }
}
