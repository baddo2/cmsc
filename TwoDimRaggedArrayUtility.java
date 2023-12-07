/*
 * Class: CMSC203 
 * Instructor: Khandan Vahabzadeh Monshi
 * Description: A utility class that manipulates a two-dimensional ragged array of doubles. This utility class will be used to create a Sales Report for Retail District #5. 
 * It will accommodate positive and negative numbers. Follow the Javadoc provided. 
 * Due: 11/28/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: __Brian Addo____
*/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TwoDimRaggedArrayUtility {
	private static final int MAX_ROWS = 10;
    private static final int MAX_COLS = 10;

	
    public TwoDimRaggedArrayUtility() {
    }

    public static double[][] readFile(File file) {
    	
        String[][] tempArray = new String[MAX_ROWS][MAX_COLS];
        try {
            Scanner fileData = new Scanner(file);
            int i = 0;
            while (fileData.hasNextLine()) {
                int j = 0;
                String line = fileData.nextLine();
                String[] splittedLine = line.split(" ");
                for (String s : splittedLine) {
                    tempArray[i][j] = s.strip();
                    j++;
                }
                i++;
            }
            fileData.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        int numRows = 0;
        int numCols = 0;

        while (tempArray[numRows][numCols] != null) {
            numRows++;
        }
        double[][] array = new double[numRows][];

        for (int i = 0; i < numRows; i++) {
            while (tempArray[i][numCols] != null) {
                numCols++;
            }
            array[i] = new double[numCols];
            for (int j = 0; j < numCols; j++) {
                array[i][j] = Double.parseDouble(tempArray[i][j]);
            }
            numCols = 0;
        }

        return array;
    }

    public static void writeToFile(double[][] data, File outputFile) {
        try {
            PrintWriter write = new PrintWriter(outputFile);
            for (double[] row : data) {
                for (double value : row) {
                    write.print(value + " ");
                }
                write.println();
            }
            write.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public static double getTotal(double[][] data) {
        double total = 0;
        for (double[] row : data) {
            for (double value : row) {
                total += value;
            }
        }
        return total;
    }

    public static double getAverage(double[][] data) {
        double numElements = 0;
        int total = 0;
        for (double[] row : data) {
            for (double value : row) {
                total += value;
                numElements++;
            }
        }
        return Math.round(total / numElements * 100.0) / 100.0;
    }

    public static double getRowTotal(double[][] data, int row) {
        double total = 0;
        for (double value : data[row]) {
            total += value;
        }
        return total;
    }

    public static double getColumnTotal(double[][] data, int col) {
        double total = 0;
        for (double[] row : data) {
            try {
                total += row[col];
            } catch (ArrayIndexOutOfBoundsException e) {
            }
        }
        return total;
    }

    public static double getHighestInRow(double[][] data, int row) {
        double highest = data[row][0];
        for (double value : data[row]) {
            if (value > highest) {
                highest = value;
            }
        }
        return highest;
    }

    public static int getHighestInRowIndex(double[][] data, int row) {
        double highest = data[row][0];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[row][i] > highest) {
                highest = data[row][i];
                index = i;
            }
        }

        return index;
    }

    public static double getLowestInRow(double[][] data, int row) {
        double lowest = data[row][0];
        for (double value : data[row]) {
            if (value < lowest) {
                lowest = value;
            }
        }
        return lowest;
    }

    public static int getLowestInRowIndex(double[][] data, int row) {
        double lowest = data[row][0];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[row][i] < lowest) {
                lowest = data[row][i];
                index = i;
            }
        }
        return index;
    }

    public static double getHighestInColumn(double[][] data, int col) {
        double highest = -getTotal(data);
        for (double[] row : data) {
            try {
                if (row[col] > highest) {
                    highest = row[col];
                }
            } catch (ArrayIndexOutOfBoundsException e) {
            }
        }

        return highest;
    }

    public static int getHighestInColumnIndex(double[][] data, int col) {
        double highest = -getTotal(data);
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            try {
                if (data[i][col] > highest) {
                    highest = data[i][col];
                    index = i;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
            }
        }
        return index;
    }

    public static double getLowestInColumn(double[][] data, int col) {
        // Makes sure first value is 100% not the lowest
        double lowest = getTotal(data);
        for (double[] row : data) {
            try {
                if (row[col] < lowest) {
                    lowest = row[col];
                }

            } catch (ArrayIndexOutOfBoundsException e) {
            }
        }
        return lowest;
    }

    public static int getLowestInColumnIndex(double[][] data, int col) {
        // Makes sure first value is 100% not the lowest
        double lowest = getTotal(data);
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            try {
                if (data[i][col] < lowest) {
                    lowest = data[i][col];
                    index = i;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
            }
        }
        return index;
    }

    public static double getHighestInArray(double[][] data) {
        double highest = data[0][0];
        for (double[] row : data) {
            for (double value : row) {
                if (value > highest) {
                    highest = value;
                }
            }
        }
        return highest;
    }

    public static double getLowestInArray(double[][] data) {
        double lowest = data[0][0];
        for (double[] row : data) {
            for (double value : row) {
                if (value < lowest) {
                    lowest = value;
                }
            }
        }
        return lowest;
    }

}