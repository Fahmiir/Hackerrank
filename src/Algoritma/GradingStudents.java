package Algoritma;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GradingStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        int modgrades = 0;
        int grade=0;
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
            modgrades=grades[grades_i]%5;
            if (modgrades>2 && grades[grades_i]>=38){
                grade=grades[grades_i]-modgrades+5;
                System.out.println(grade);
            } else {
                grade=grades[grades_i];
                System.out.println(grade);
            }
        }
       
	}

}
