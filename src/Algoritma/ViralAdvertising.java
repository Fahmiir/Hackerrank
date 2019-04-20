package Algoritma;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class ViralAdvertising {
	// Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
    double s=5;
    double l=Math.floor(s/2);
    double sum=0;
    for(int i=1;i<=n;i++){
    sum=sum+l;
    s=Math.floor(s/2)*3;
    l=Math.floor(s/2);
    }
    return (int)sum;
    }

    private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int result = viralAdvertising(n);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	}

}
