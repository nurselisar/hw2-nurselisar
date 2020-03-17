package demo.junit_class_demo.grades;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Assert.*;

public class ChartIOTest {
	
	ChartIO io = new ChartIO();
	
	@Test
	public void test_readFile_happyPath() {
		String path = "src/test/resources/grades_normal.csv";
		
		int[] dizi = new int[3];
		dizi[0] = 15;
		dizi[1] = 10;
		dizi[2] = 0;
		
		Assert.assertArrayEquals(dizi,io.readFile(path));
	}
	
	@Test( expected = IllegalArgumentException.class)
	public void test_readFile_SadPath() {
		io.readFile("nurseli");
	}
	
	@Test (expected = NumberFormatException.class)
	public void test_ExceptionFileReading() {
		String path = "src/test/resources/grades_invalid.csv";
		io.readFile(path);
	}
}
