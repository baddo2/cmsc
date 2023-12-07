import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoDimRaggedArrayUtilityTestStudent {
	double[][] dataSet1 = {
			{ 8, 7, 6 },
			{ 5, 4 },
			{ 3, 2, 1 } };
    
    double[][] dataSet2 = {
            { 0, 6 },
            { 2, 5, 3 },
            { 7, 1, 8, 1 } };
    
    
    String path = TwoDimRaggedArrayUtility.class.getProtectionDomain().getCodeSource().getLocation().getPath();
    
    String readPath = path + "\\readFileTestData.txt";
    String writePath = path + "\\writeFileTestData.txt";
    
	final String readFileDataSetString = "1 6 8\n" + 
									     "9 8 6 4 7 1\n" + 
									     "10 8 6 5 2\n";
	final double[][] readFileDataSet = {{1, 6, 8},  
								       {9, 8, 6, 4, 7, 1}, 
								       {10, 8, 6, 5, 2}};

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	
		

@Test
void testReadFile() {
	
	try {
		PrintWriter write = new PrintWriter(readPath);
		write.print(readFileDataSetString);
		write.close();
	} catch (FileNotFoundException e) {
		fail("Cannot read into read path file");
	}
	double[][] result = TwoDimRaggedArrayUtility.readFile(new File(readPath));
	if (result.length > 0) {
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				assertEquals(readFileDataSet[i][j], result[i][j]);
			}
		}
	} else {
		fail("Data list length == 0");
	}

}

@Test
void testWriteToFile() {

	final double[][] writeFileData = dataSet2;
	TwoDimRaggedArrayUtility.writeToFile(writeFileData, new File(writePath));
	assertTrue(new File(writePath).exists());

	double[][] result = TwoDimRaggedArrayUtility.readFile(new File(writePath));
	assertEquals(33.0, TwoDimRaggedArrayUtility.getTotal(result));
	assertEquals(3.67, TwoDimRaggedArrayUtility.getAverage(result));
	assertEquals(8.0, TwoDimRaggedArrayUtility.getHighestInRow(result, 2));

}

@Test
void testGetTotal() {
	assertEquals(36.0, TwoDimRaggedArrayUtility.getTotal(dataSet1));
	assertEquals(33.0, TwoDimRaggedArrayUtility.getTotal(dataSet2));

}

@Test
void testGetAverage() {
	assertEquals(4.5, TwoDimRaggedArrayUtility.getAverage(dataSet1));
	assertEquals(3.67, TwoDimRaggedArrayUtility.getAverage(dataSet2));
}

@Test
void testGetRowTotal() {
	assertEquals(21.0, TwoDimRaggedArrayUtility.getRowTotal(dataSet1, 0));
	assertEquals(6.0, TwoDimRaggedArrayUtility.getRowTotal(dataSet2, 0));
}

@Test
void testGetColumnTotal() {
	assertEquals(16.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 0));
	assertEquals(9.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet2, 0));
}

@Test
void testGetHighestInRow() {
	assertEquals(3.0, TwoDimRaggedArrayUtility.getHighestInRow(dataSet1, 2));
	assertEquals(8.0, TwoDimRaggedArrayUtility.getHighestInRow(dataSet2, 2));
}

@Test
void testGetHighestInRowIndex() {
	assertEquals(0, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1, 2));
	assertEquals(2, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet2, 2));
}

@Test
void testGetLowestInRow() {
	assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInRow(dataSet1, 2));
	assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInRow(dataSet2, 2));
}

@Test
void testGetLowestInRowIndex() {
	assertEquals(2, TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet1, 2));
	assertEquals(1, TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet2, 2));
}

@Test
void testGetHighestInColumn() {
	assertEquals(6.0, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1, 2));
	assertEquals(8.0, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet2, 2));
}

@Test
void testGetHighestInColumnIndex() {
	assertEquals(0, TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1, 2));
	assertEquals(2, TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet2, 2));
}

@Test
void testGetLowestInColumn() {
	assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1, 2));
	assertEquals(3.0, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet2, 2));
}

@Test
void testGetLowestInColumnIndex() {
	assertEquals(2, TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1, 2));
	assertEquals(1, TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet2, 2));
}

@Test
void testGetHighestInArray() {
	assertEquals(8.0, TwoDimRaggedArrayUtility.getHighestInArray(dataSet1));
	assertEquals(8.0, TwoDimRaggedArrayUtility.getHighestInArray(dataSet2));
}

@Test
void testGetLowestInArray() {
	assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInArray(dataSet1));
	assertEquals(0, TwoDimRaggedArrayUtility.getLowestInArray(dataSet2));
}

}
