import java.io.IOException;

import Util.ConsoleInput;
import Util.ConsoleOutput;
import Util.FileInput;
import Util.FileOutput;
import Util.Abstract.Input;
import Util.Abstract.Output;


public class Main {

	public static void main(String[] args) throws IOException{
		System.out.println("Welcome.");
		System.out.println("Select an input option");
		Input input = getInputType();
		String[] sentenceList = input.get();
		System.out.println("Select an output option");
		Output output = getOutputType();
		output.print(sentenceList);
		System.out.println("Exiting application.");
	}

	private static Input getInputType() {
		int option = printOptions("input.txt");
		switch(option){
		case 1:
			return new ConsoleInput();
		case 2:
			return new FileInput();
		default:
			System.out.println("Wrong type. Try again");
			return getInputType();
		}
	}
	private static Output getOutputType() {
		int option = printOptions("output.txt");
		switch(option){
		case 1:
			return new ConsoleOutput();
		case 2:
			return new FileOutput();
		default:
			System.out.println("Wrong type. Try again");
			return getOutputType();
		}
	}
	
	private static int printOptions(String filename){
		ConsoleInput input = new ConsoleInput();
		System.out.println("1. Console");
		System.out.println("2. File (" +filename+ ")");
		return input.getInputInt();
	}
}
