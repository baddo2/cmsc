/*
 * Class: CMSC203 
 * Instructor: Khandan Vahabzadeh Monshi
 * Description: A utility class that will calculate holiday bonuses given a ragged array of doubles which represent the sales for each store in each category. 
 * It will also take in bonus amount for the store with the highest sales in a category, the bonus amount for the store with the lowest sales in a category and the bonus amount for all other stores.
 * Due: 11/28/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: __Brian Addo____
*/


public class HolidayBonus {
    private final static int MAX_BONUS = 5000;
    private final static int MIN_BONUS = 1000;
    private final static int OTHER_BONUS = 2000;

    public HolidayBonus() {
    }

    /**
     * Calculates holiday bonuses for each store based on the sales data.
     * @param data The two dimensional array of store sales.
     * @return An array of holiday bonuses for each store.
     */
    public static double[] calculateHolidayBonus(double[][] data) {
    	double[] bonus = new double[data.length];

    	for (int i = 0; i < data.length; i++){
    		int highIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, i);
    		int lowIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data,i);
    		for (int j=0; j < data[i].length; j++)
    			if (j < data[i].length) {
    				if (i == highIndex) 
    					bonus[i] += MAX_BONUS;
    				else if (i == lowIndex) 
    					bonus[i] += MIN_BONUS;
    				else 
    					bonus[i] += OTHER_BONUS;
    			}
    	}
    	
    	return bonus;
    }

    /**
     * Calculates the total holiday bonuses for the district.
     * @param data The two dimensional array of store sales.
     * @return The total holiday bonuses for the district.
     */
    public static double calculateTotalHolidayBonus(double[][] data) {
        double total = 0;
        double[] bonus = calculateHolidayBonus(data);
        for (double value : bonus)
            total += value;
        return total;
    }
}