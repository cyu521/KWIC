package Util;

import Util.Abstract.Output;

public class ConsoleOutput extends Output{

	@Override
	public void print(String[] sentenceList) {
		sentenceList = sortList(sentenceList);
		System.out.println("List of all circular shifts of all lines in alphabetical order");
		for(int i=0; i<sentenceList.length; i++)
		{
			System.out.println(sentenceList[i]);
		}
		
	}

}
