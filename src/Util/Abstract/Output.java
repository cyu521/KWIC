package Util.Abstract;

import KWIC.AlphabeticalOrder;

public abstract class Output {

	public abstract void print(String[] sentenceList);
	
	protected String[] sortList(String[] sentenceList){
		AlphabeticalOrder ao = new AlphabeticalOrder();
		return ao.sortList(sentenceList);
	}
}
