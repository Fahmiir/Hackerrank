package Algoritma;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DesignerPDFViewer {
	
	static int designerPdfViewer(int[] h, String word) {
	    int x=0;
	    String c = "abcdefghijklmnopqrstuvwxyz";
	    for(int i=0;i<word.length();i++){
	     int temp=0;     
	       for(int j=0;j<c.length();j++){
	         if(word.charAt(i)==c.charAt(j)){
	          temp=h[j];        
	          }  
	       }
	     if(temp>x){
	       x=temp;      
	     }
	    } 
	    return x*word.length();
	    }
	private static final Scanner scanner = new Scanner(System.in);
	 
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();

	}

}
