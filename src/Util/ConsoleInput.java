package Util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import Util.Abstract.Input;

public class ConsoleInput extends Input{

	@Override
	public String[] get() throws IOException {
		String line = "";
		List<String> sentenceList = new ArrayList<String>();

        System.out.println("Enter a sentence, type 'exit' to end the file: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        
        BufferedReader bufferedReader = new BufferedReader(isr);
             do
             {
                 line = bufferedReader.readLine();
                 if(!line.equals("exit"))
                 {
                 //remove selected punctuation from line , . ?
                 line = line.replaceAll("\\,", "").replaceAll("\\.", "").replaceAll("\\?", "");
                 sentenceList.add(line);
                 }
             }while(!line.equals("exit"));

  		String[] sentenceArray = sentenceList.toArray(new String[sentenceList.size()]);
		return getShiftedSentence(sentenceArray);
	}

	/*
	 * Ask the user to input an int
	 */
	public int getInputInt() {
		String line = null;
		int input = 0;
		line = getInputString();
		if (line == null)
			return -1;
		try {
			input = Integer.parseInt(line);

		} catch (NumberFormatException ex) {
			return -1;
		}
		return input;
	}
	

	public String getInputString() {
		String line = null;
        InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader is = new BufferedReader(isr);
		try {
			line = is.readLine();
		} catch (NumberFormatException ex) {
			return null;
		} catch (IOException e) {
			return null;
		}
		return line;
	}

}
