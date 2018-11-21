package com.ksl.jms.sample.file;

import java.io.*;

public class FileRead {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
        // The name of the file to open.
        String fileName = "/Users/kunallawtawar/Downloads/dheeru/temp.txt";
		
		  // This will reference one line at a time
        String line = null;
        String text = "Isp2";
        String text2 = "wsp";
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =  new FileReader(fileName);
            
            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =  new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null) {
                System.out.println("echo :" + line);
                
                if (line.equals(text)) {
                	 System.out.println("text :" + line);
                	
                }
                if (line.contains(text2)) {
               	 System.out.println("text2 :" + line);
               	
               }                
                
            }
            // Always close files.
            bufferedReader.close();   
            
        }
        
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
        
	}

}
