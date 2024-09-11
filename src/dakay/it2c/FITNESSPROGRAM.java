package dakay.it2c;

import java.util.Scanner;

public class FITNESSPROGRAM {
   FITNESSPROGRAMS[] programs;
     int count;

    public FITNESSPROGRAM(int size) {
        programs = new FITNESSPROGRAMS[size];
        count = 0;
    }

    public void addPrograms() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of applications: ");
        int nums = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < nums; i++) {
            System.out.println("Enter details of application " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("BMI: ");
            double bmi = sc.nextDouble();
            sc.nextLine(); 
            System.out.print("FITNESS GOAL: ");
            String fitnessGoal = sc.nextLine();

            programs[count++] = new FITNESSPROGRAMS(id, name, age, bmi, fitnessGoal);
        }
    }

    public void viewPrograms() {
        System.out.printf("%-10s %-20s %-10s %-10s %-20s %-20s\n",
                "ID", "Name", "Age", "BMI", "Fitness Goal", "Eligibility Status");
        for (int i = 0; i < count; i++) {
            programs[i].viewfitness();
        }
    }
}
