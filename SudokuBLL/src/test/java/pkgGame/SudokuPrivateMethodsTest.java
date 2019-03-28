package pkgGame;

import static org.junit.Assert.*;

import org.junit.Test;
import java.lang.reflect.Method;

public class SudokuPrivateMethodsTest {

	public SudokuPrivateMethodsTest() {
	}
	
	@Test
	public void FillDiagonalRegions() {
		try {
			Sudoku s = new Sudoku(9);
			s.FillDiagonalRegions(); /*figure out java reflections*/
			int[] expectRegion = {1,2,3,4,5,6,7,8,9};
			int[] region0 = s.getRegion(0);
			int[] region4 = s.getRegion(4);
			int[] region8 = s.getRegion(8);
			
			assertEquals(expectRegion, region0);
			assertEquals(expectRegion, region4);
			assertEquals(expectRegion, region8);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	private void PrintStars() {
		
	}
	
	@Test
	public void Sudoku_Test_SetRegion() {
		try {
			Sudoku s = new Sudoku(9);
			s.SetRegion(1); /*how do you use reflections*/
			
			int[] expectRegion = {1,2,3,4,5,6,7,8,9};
			int[] region = s.getRegion(1);
			
			assertEquals(expectRegion, region);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
