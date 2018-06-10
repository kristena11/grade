/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kristen Albrecht
 */
public class StudentGrade {
    public static void main(String[] args)
    {
       //loop though generator 5 times
        int j = 0;
        while (j <= 4)
        {
            // Generate random number 
            int grade = (int)(Math.random() * 50) + 50;
           
            //assign letter grade to the value
            if(grade >= 90)
            {
                System.out.println("Student grade is " + grade + " which is A");
            }
            else if(grade >= 80)
            {
                 System.out.println("Student grade is " + grade + " which is B");        
            }
            else if(grade >= 70)
            {
                 System.out.println("Student grade is " + grade + " which is C");        
            }
            else if(grade >= 60)
            {
                 System.out.println("Student grade is " + grade + " which is D");        
            }
            else 
            {
                 System.out.println("Student grade is " + grade + " which is F");        
            }
            
            //add 1 to j
            j++;
      
        } 
       
    }
    
}
