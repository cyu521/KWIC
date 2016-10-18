package Util.Abstract;

import java.io.IOException;
import Util.SentenceManager;

public abstract class Input {

	public abstract String[] get() throws IOException;
	
	protected String[] getShiftedSentence(String[] sentenceFromFile)
	{
      	SentenceManager sm = new SentenceManager();
      	return sm.getShiftedSentence(sentenceFromFile);
	}
}
