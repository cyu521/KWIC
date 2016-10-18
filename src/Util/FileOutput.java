package Util;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import Util.Abstract.Output;

public class FileOutput extends Output {

	@Override
	public void print(String[] sentenceList) {
		sentenceList = sortList(sentenceList);
		PrintWriter writer;
		try {
			writer = new PrintWriter("output.txt", "UTF-8");
			for(int i=0; i<sentenceList.length; i++)
			{
				writer.println(sentenceList[i]);
			}
			writer.close();
			System.out.println("Saved output to output.txt");
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
