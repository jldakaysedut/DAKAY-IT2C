package dakay.it2c;

public class FITNESSPROGRAMS {
     int applicationid;
    String name;
     int age;
     double bmi;
     String fitness;

    public FITNESSPROGRAMS(int applicationid, String name, int age, double bmi, String fitness) {
        
        
        this.applicationid = applicationid;
        this.name = name;
        this.age = age;
        this.bmi = bmi;
        this.fitness = fitness;
   
    
    }

   public void viewfitness() {
    String eligibilityStatus;
    
 if (age < 18) {
        eligibilityStatus = "Not elegible(Age too low)";
} else if (age > 65) {
        eligibilityStatus = "Not elegible(Age too high)";
} else {
        eligibilityStatus = "Eligible";
}

 
    System.out.printf("%-10d %-20s %-10d %-10.2f %-20s %-20s\n",
            applicationid, name, age, bmi, fitness, eligibilityStatus);
}

   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
