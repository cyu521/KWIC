package KWIC;


import java.util.Arrays;

public class AlphabeticalOrder {

	public String[] sortList(String[] unsortedList) {
		Arrays.sort(unsortedList, String.CASE_INSENSITIVE_ORDER);
		return unsortedList;
	}

}
