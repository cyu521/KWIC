package Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import KWIC.CircularShift;

public class SentenceManager {

	public String[] getShiftedSentence(String[] sentenceFromFile)
	{
		CircularShift cs = new CircularShift();
		List<String> sentenceList = new ArrayList<String>();
		for(int i=0; i<sentenceFromFile.length;i++)
		{
			//creates a circularShift, then add the string array to sentenceList
		    Collections.addAll(sentenceList, cs.createCircularShift(sentenceFromFile[i]));
		}
		//convert sentencelist to an string array
		return sentenceList.toArray(new String[sentenceList.size()]);
	}
}
