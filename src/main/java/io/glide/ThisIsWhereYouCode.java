package io.glide;

import java.util.Arrays;

/**
 * This is where you have to code.
 *
 * See javadoc and associated unit tests to understand what is expected
 */
public class ThisIsWhereYouCode {

    /**
     * input will be a string, but it may not have a file extension. return the file
     * extension (with no period) if it has one, otherwise null
     *
     * @param filename
     * @return null if input is null or filename has no extension and the
     *         extension without the period otherwise
     */
	public String getFileNameExtension(String filename) {
		String extention = "";
		if (filename == null) {
			extention = null;
		} else {
			int index = filename.lastIndexOf('.');
			System.out.println("filename==" + filename + "****index" + index);
			if (index >= 0) {
				extention = filename.substring(index + 1);
			} else {
				extention = null;
			}
		}
		return extention;
	}

    /**
     * return the longest string contained inside the input array
     *
     * @param array input Array of values
     * @return null if input is null and the longest string otherwise
     */
    public String getLongestString(Object[] array) {
		String longest = null;
		if (array.length>0 && array[0] != null) {
			if (array[0] instanceof Integer) {
				longest = null;

			} else if (array[0] instanceof String) {
				longest = (String) array[0];

			} else {
				longest = getLongestString((Object[]) array[0]);
			}
		}
		for (int i = 1; i < array.length; i++) {
			if (array[i] instanceof Integer ) {
				longest = null;

			}
			else if (array[i] instanceof String) {
				if (array[i].toString().length() > (longest!=null ? longest.length():0)) {
					longest = array[i].toString();
				}
			} else{
				longest = getLongestString((Object[]) array[i]);
			}
		}
		return longest;
    }

    /**
     * Returns true if both arrays contains the same values in the same order
     *
     * @param array1 first Array to test
     * @param array2 second Array to test
     * @return true if both arrays contains the same values
     */
    public boolean areArraysEquals(String[] array1, String[] array2) {
        return Arrays.equals(array1,array2);
    }

    /**
     * Compress the input string with a very dummy algorithm : repeated letters
     * are replaced by {n}{letter} where n is the number of repetition and
     * {letter} is the letter. n must be superior to 1 (otherwise, simply output
     * the letter)
     *
     * @param input the input string that can only contains letters
     * @return the compressed String or null if the input is null
     */
    public String getCompressedString(String input) {
        // XXX implement me !
        return null;
    }

    /**
     * Sort the input array of string based on lexicographic order of the
     * corresponding compressed string.
     *
     * Hint : The expected sorting should use the getCompressedString implementation
     *
     * @param array the Array to sort
     * @return the sorted array
     */
    public String[] getSortedArray(String[] array) {
    	Arrays.sort(array);
    	for (int i = 0; i < array.length; i++) {
    		System.out.println("element ="+array[i]);
		}
    	
        return array;
    }

}
