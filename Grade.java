 /*
 * Darin Vidhu A
 * 02 - 07 - 2025
 * 21:11
 * Grade calculator
 */

 import java.util.*;
 public class Grade {
    public static void printvalue (String []subject , int [] grade , int numofsub){
        System.out.println("-----Report-----");                                     //method to print the value
        for (int i = 0 ; i < numofsub ; i++){
                System.out.print(subject[i]+ " : " + grade[i]+"\n");
            }
    }
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the number of subjects : ");
        int numofsub = sc.nextInt();
        sc.nextLine();
        int sum = 0;

        String [] subject = new String [numofsub];
        int [] grade = new int [numofsub];          //array to store the subject and mark

        for (int i = 0 ; i < subject.length ; i++ ){
            System.out.print("Enter Subject "+(i+1)+": ");  //entering subject
            subject[i] = sc.nextLine();
        }
        
        System.out.println();
        for (int i = 0 ; i < grade.length ; i++){
            System.out.print("Enter the mark for " + subject[i] + " : " );  //entering mark
            grade [i] = sc.nextInt();
        }

        for (int i = 0 ; i < grade.length ; i++){
            sum = sum + grade[i];                       // to calculate total
        }
        System.out.println();
        printvalue(subject, grade, numofsub);       //calling to print

        System.out.println();
        System.out.print ("total : " + sum);        //print total
        
        float avg = sum / numofsub;
        System.out.println();
        System.out.print("average : "  + avg);      // to find and print avg 

        char ch;                            // below are the grade ranges 
                                            // grade is printed according to the mark
        if (avg >= 90){
            ch = 'A';
            System.out.print ("\nYou have got grade " + ch );
        }
        else if (avg >= 80 && avg < 90){
            ch = 'B';
            System.out.print ("\nYou have got grade " + ch);
        }
        else if (avg >= 70 && avg < 80){
            ch = 'C';
            System.out.print ("\nYou have got grade " + ch);
        }
        else if (avg >= 50 && avg < 70){
            ch = 'D';
            System.out.print ("\nYou have got grade " + ch);
        }
        else {
            ch = 'F';
            System.out.print ("\nyou have got grade " + ch);
        }

    }
 }

 // Have a great day :)