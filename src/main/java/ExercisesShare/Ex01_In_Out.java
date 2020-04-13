package ExercisesShare;

import java.util.Scanner;

public class Ex01_In_Out {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);
//        System.out.print("first name: ");
        String firstName = reader.next();
//        System.out.print("age: ");
        int age = reader.nextInt();
//        System.out.print("stage of education: ");
        String stageOfEducation = reader.next();
//        System.out.print("years of experience: ");
        int yersOfExperience = reader.nextInt();
//        System.out.print("cuisine preference: ");
        String cuisinePreference = reader.next();

        System.out.println("The form for "+firstName+" is completed. We will contact " +
                "you if we need a chef that cooks "+cuisinePreference+" dishes.");


    }
}
