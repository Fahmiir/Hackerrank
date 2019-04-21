package Algoritma;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SaveThePrisoner {

	 static int saveThePrisoner(int n, int m, int s) {
		    int x=s+m-1;
		    if(x>n){
		      if(x%n==0){
		       x=n;       
		      } else {     
		        x=x%n;
		      }    
		    } 

		    return x;
		    }
	 private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nms = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nms[0]);

            int m = Integer.parseInt(nms[1]);

            int s = Integer.parseInt(nms[2]);

            int result = saveThePrisoner(n, m, s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
	}

}
