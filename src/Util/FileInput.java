package Util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Util.Abstract.Input;

public class FileInput extends Input {

	@Override
	public String[] get() throws IOException {
		List<String> sentenceList = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		try {
		    String line = br.readLine();
		    while (line != null) {
		    	//remove selected punctuation from line , . ?
	            line = line.replaceAll("\\,", "").replaceAll("\\.", "").replaceAll("\\?", "");
	            sentenceList.add(line);
		        line = br.readLine();
		    }
		} finally {
		    br.close();
			System.out.println("Reading from input.txt");
		}
		String[] sentenceArray = sentenceList.toArray(new String[sentenceList.size()]);
		return getShiftedSentence(sentenceArray);
	}

}
