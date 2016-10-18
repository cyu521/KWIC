package KWIC;

public class CircularShift {

	private final String WORD_SEPARATER = " ";
	
	public String[] createCircularShift(String sentence){
		//split the sentence into a word list
		String[] wordList = sentence.split(WORD_SEPARATER);
		int numOfWords = wordList.length;
		//the list of string being returned
		String[] returnList = new String[numOfWords];
		//since there are n words, there should be n sentences
		for(int i=0; i<numOfWords; i++)
		{
			StringBuilder sb = new StringBuilder("");
			//each sentence should have n word
			for(int j=i; j<numOfWords+i; j++)
			{
				//get the index of the word we want
				int index;
				//if this will get the index at the beginning of the sentence
				if(j>=numOfWords)
					index=j-numOfWords;
				else
					index=j;
				sb.append(wordList[index]);
				sb.append(WORD_SEPARATER);
			}
			//remove the extra space at the end
			sb.setLength(sb.length() - 1);
			//change 
			returnList[i]=sb.toString();
		}
		return returnList;
		
	}
}
