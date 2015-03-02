import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
        public static void main(String[] args) {
                String n1, n2, n3, n4,n5, max;
                int med, middle;
                Double dbln1, dbln2, dbln3, dbln4, dbln5, dblsum, dblavr, dblmax, dblmin, dblmed, dblmed2;
                int int1, int2, int3, int4, int5;
 
                System.out.println("Welcome!");
                System.out.println("Please input five numbers "); //promt user to input number
                Scanner keyboard = new Scanner(System.in);
                n1 = keyboard.next();//input1
                n2 = keyboard.next();//input2
                n3 = keyboard.next();//input3
                n4 = keyboard.next();//input4
                n5 = keyboard.next();//input5

                dbln1 = Double.parseDouble(n1); //double value
                int1 = dbln1.intValue(); //change from double to interger for sorting
                dbln2 = Double.parseDouble(n2);
                int2 = dbln2.intValue();
                dbln3 = Double.parseDouble(n3);
                int3 = dbln3.intValue();
                dbln4 = Double.parseDouble(n4);
                int4 = dbln4.intValue();
                dbln5 = Double.parseDouble(n5);
                int5 = dbln5.intValue(); //

                dblsum = dbln1+dbln2+dbln3+dbln4+dbln5; //find the sum
                System.out.println("The sum of the five numbers is " + dblsum); //display the sum

                dblavr = (dbln1+dbln2+dbln3+dbln4+dbln5)/5; //find the average
                System.out.println("The average of the five number is " + dblavr); // display the avarage

                dblmax = Math.max(Math.max(dbln3, Math.max(dbln1, dbln4)), Math.max(dbln2, dbln5)); //find the max
                System.out.println("The maximum of the five number is " + dblmax); //display the max

                dblmin = Math.min(Math.min(dbln1, Math.min(dbln2, dbln3)), Math.min(dbln3, dbln5)); //find the min
                System.out.println("The minimum of the five number is " + dblmin); //Display the min

                int set[] = {int1, int2, int3, int4, int5};//setup the set
                Arrays.sort(set); //reorder it
                middle = set.length/2;//find the middle number
                med = set[middle + 0];//find the median
                System.out.println("The median of the five number is " + med); //diplay the median
	}
}

