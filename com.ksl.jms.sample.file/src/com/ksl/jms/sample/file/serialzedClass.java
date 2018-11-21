package com.ksl.jms.sample.file;

import java.io.*;

public class serialzedClass implements Serializable {
	
	public void filemethod (File file) {
		
		try {
			
			BufferedReader bfr = new BufferedReader(new FileReader(file));
			
			String line = null;
	
			while ((line = bfr.readLine()) != null){
				System.out.println(line);
			}		
			bfr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}}
	
	public static void main(String[] args) {
		File file = new File("testfile");
		File file2 = new File("testfile2");

	
		serialzedClass srclass = new serialzedClass();
		srclass.filemethod(file);
		System.out.println("next file");
		srclass.filemethod(file2);
	}
}
