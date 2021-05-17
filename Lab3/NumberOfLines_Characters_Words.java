/* Exercise 5: Write a Java program that displays 
 * the number of characters, lines and words in a text?
 */

// 
package lab3;

import java.io.*;

public class NumberOfLines_Characters_Words {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("D:\\CapgeminiJA17\\LabBook_Programs\\src\\lab3\\File1.txt"); 
        FileInputStream fileStream = new FileInputStream(file); 
        InputStreamReader input = new InputStreamReader(fileStream); 
        BufferedReader reader = new BufferedReader(input); 
          
        String line; 
          
        // Initializing counters 
        int countWord = 0; 
        int lineCount = 0; 
        int characterCount = 0; 
          
        // Reading line by line from the  
        // file until a null is returned 
        while((line = reader.readLine()) != null) 
        { 
            if(!(line.equals(""))) 
            { 
                  
                characterCount += line.length(); 
                  
                // \s+ is the space delimiter in java 
                String[] wordList = line.split("\s+"); 
                  
                countWord += wordList.length;  
                  
                // [!?.:]+ is the sentence delimiter in java 
                String[] lineList = line.split("[,;!?.:]+"); 
                  
                lineCount += lineList.length; 
            } 
        } 
        
        System.out.println("Total number of characters = " + characterCount); 
        System.out.println("Total number of lines = " + (lineCount-1)); 
        System.out.println("Total word count = " + countWord); 
        
        reader.close();
        
	}

}
