package in.mgp.say;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteManipulation {
	private String clarityData;
	private String newData;

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String output = "<xml></xml>";
		
		byte[] byteString = output.getBytes()	;

		ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
		arrayOutputStream.write(output.getBytes());
		
		System.out.println(arrayOutputStream.size());
	}
	
	

}
