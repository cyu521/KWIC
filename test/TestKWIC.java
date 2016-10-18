import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import KWIC.AlphabeticalOrder;
import KWIC.CircularShift;
import Util.SentenceManager;


public class TestKWIC {

	private final String[] unsortedList = 
		{
			"What is gooder than god",
			"is gooder than god What",
			"gooder than god What is",
			"than god What is gooder",
			"god What is gooder than"
		};

	private final String[] sortedList = 
		{
			"god What is gooder than",
			"gooder than god What is",
			"is gooder than god What",
			"than god What is gooder",
			"What is gooder than god",
		};
	
	@Test
	public void testCircularShift() {
		CircularShift cs = new CircularShift();
		String[] stringList = cs.createCircularShift("What is gooder than god");
		assertArrayEquals( unsortedList, stringList);
	}
	

	@Test
	public void testSortList() {
		AlphabeticalOrder cs = new AlphabeticalOrder();
		String[] stringList = cs.sortList(unsortedList);
		assertArrayEquals(sortedList, stringList);
	}

	private String[] combineTwoList(String[] first, String[] second) {
	    List<String> both = new ArrayList<String>(first.length + second.length);
	    Collections.addAll(both, first);
	    Collections.addAll(both, second);
	    return both.toArray(new String[both.size()]);
	}
	
	@Test
	public void testGetShiftedSentence() {
		SentenceManager sm = new SentenceManager();
		//creates an array of
		//["What is gooder than god","What is gooder than god"]
		String[] sentenceList = {unsortedList[0], unsortedList[0]};
		//calling testing function
		String[] returnList = sm.getShiftedSentence(sentenceList);
		//should expect two unsortedList concatenate
		String[] expectedList = combineTwoList(unsortedList,unsortedList);
		assertArrayEquals(expectedList, returnList);
	}

}
