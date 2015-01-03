import static org.junit.Assert.*;

import org.junit.Test;


public class MineFieldTest {

	@Test
	public void test_2x2_MineField_WithOneMine() {
		// ... 111
		// .*. 1*1
		// ... 111
		
		MineField mineField = new MineField(3,3);
		mineField.placeMine(2, 2);
		
		assertEquals("1", mineField.getQuadrantValue(1, 1));
		assertEquals("1", mineField.getQuadrantValue(1, 2));
		assertEquals("1", mineField.getQuadrantValue(1, 3));
		
		assertEquals("1", mineField.getQuadrantValue(2, 1));
		assertEquals("*", mineField.getQuadrantValue(2, 2));
		assertEquals("1", mineField.getQuadrantValue(2, 3));
		
		assertEquals("1", mineField.getQuadrantValue(3, 1));
		assertEquals("1", mineField.getQuadrantValue(3, 2));
		assertEquals("1", mineField.getQuadrantValue(3, 3));
	}
	
	public void test_3x4_MineField_With3Mines() {
		// *... *211
		// ..*. 12*1
		// .... 0111
		
		MineField mineField = new MineField(3,3);
		mineField.placeMine(2, 2);
		
		assertEquals("*", mineField.getQuadrantValue(1, 1));
		assertEquals("2", mineField.getQuadrantValue(1, 2));
		assertEquals("1", mineField.getQuadrantValue(1, 3));
		assertEquals("1", mineField.getQuadrantValue(1, 4));
		
		assertEquals("1", mineField.getQuadrantValue(2, 1));
		assertEquals("2", mineField.getQuadrantValue(2, 2));
		assertEquals("*", mineField.getQuadrantValue(2, 3));
		assertEquals("1", mineField.getQuadrantValue(2, 3));
		
		assertEquals("0", mineField.getQuadrantValue(3, 1));
		assertEquals("1", mineField.getQuadrantValue(3, 2));
		assertEquals("1", mineField.getQuadrantValue(3, 3));
		assertEquals("1", mineField.getQuadrantValue(3, 4));
	}
	
	
	public void test_5x5_MineField_WithTwoMine() {
		// *... *211
		// ..*. 12*1
		// .... 0111
		
		MineField mineField = new MineField(5,5);
		mineField.placeMine(2, 2);
		
		assertEquals("*", mineField.getQuadrantValue(1, 1));
		assertEquals("2", mineField.getQuadrantValue(1, 2));
		assertEquals("1", mineField.getQuadrantValue(1, 3));
		assertEquals("1", mineField.getQuadrantValue(1, 4));
		
		assertEquals("1", mineField.getQuadrantValue(2, 1));
		assertEquals("2", mineField.getQuadrantValue(2, 2));
		assertEquals("*", mineField.getQuadrantValue(2, 3));
		assertEquals("1", mineField.getQuadrantValue(2, 3));
		
		assertEquals("0", mineField.getQuadrantValue(3, 1));
		assertEquals("1", mineField.getQuadrantValue(3, 2));
		assertEquals("1", mineField.getQuadrantValue(3, 3));
		assertEquals("1", mineField.getQuadrantValue(3, 4));
	}

}
