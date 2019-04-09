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
			s.FillDiagonalRegions(); 
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
	public void PrintStars() {
		Sudoku s1= null;
		
		int[][] puzzle = { 
				{ 5, 3, 4, 6, 7, 8, 9, 1, 2 }, 
				{ 6, 7, 2, 1, 9, 5, 3, 4, 8 }, 
				{ 1, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, 
				{ 4, 2, 6, 8, 5, 3, 7, 9, 1 }, 
				{ 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, 
				{ 2, 8, 7, 4, 1, 9, 6, 3, 5 }, 
				{ 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
		try {
			s1 = new Sudoku(puzzle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s1.PrintPuzzle();
	}
	
	@Test
	public void Sudoku_Test_SetRegion() {
		try {
			Sudoku s = new Sudoku(9);
			s.SetRegion(1); 
			
			int[] expectRegion = {1,2,3,4,5,6,7,8,9};
			int[] region = s.getRegion(1);
			
			assertEquals(expectRegion, region);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
