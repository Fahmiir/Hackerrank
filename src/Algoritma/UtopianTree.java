package Algoritma;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class UtopianTree  {
    static int utopianTree(int n) {
    int x=1;
    for(int i=1;i<=n;i++){
    if(i%2==1){
    x=2*x;       
    } else if(i%2==0){
    x=x+1;        
    }       
    }
    return x;
    }

    private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
		 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int t = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int tItr = 0; tItr < t; tItr++) {
	            int n = scanner.nextInt();
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            int result = utopianTree(n);

	            bufferedWriter.write(String.valueOf(result));
	            bufferedWriter.newLine();
	        }

	        bufferedWriter.close();

	        scanner.close();
	}

}
