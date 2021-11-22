import java.util.Arrays;
import java.util.Scanner;
public class StudentGrades {

    String studentName;
    double[] grades;
    double lowestGrade;
    double highestGrade;
    int numberOfGrades;
    int inputNumberOfGrades;
    float average;
    boolean isReady;
    
    public StudentGrades() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter student's name: ");
        this.studentName = input.nextLine();
        
        System.out.println("Enter how many grades you want to input: ");
        this.inputNumberOfGrades = input.nextInt();
        double[] gradesInput = new double[this.inputNumberOfGrades];
        
        for (int i=0; i < this.inputNumberOfGrades; i++){
            
            System.out.println("Enter a grade: ");
            
            gradesInput[i] = input.nextDouble();
            }
        
        this.grades = gradesInput;
          
    }
    
    public void findLowestGrade(){
        
        this.lowestGrade = this.grades[0];
        
        for (int i=0; i<this.grades.length;i++){
            this.lowestGrade = (this.lowestGrade < this.grades[i]) ? this.lowestGrade : this.grades[i];
        }
        
    }
    
    public void findHighestGrade(){
        
        this.highestGrade = this.grades[0];
        
        for (int i=0; i<this.grades.length;i++){
            this.highestGrade = (this.highestGrade > this.grades[i]) ? this.highestGrade : this.grades[i];
        }
        
    }
    
    public void findNoOfGrades(){
        
        this.numberOfGrades = this.grades.length;
        
    }
    
    public void findAverage(){
        double sum = 0;
        
        for (int i=0; i<this.grades.length;i++){
            sum += this.grades[i];
        }
        
        this.average = (float) sum/this.numberOfGrades;
    }
    
    public void displayInformation(){
        System.out.println("Name: " + this.studentName);
        System.out.println("Grades: " + Arrays.toString(this.grades));
        System.out.println("Number of grades: " + this.numberOfGrades);
        System.out.println("Lowest grade: " + this.lowestGrade);
        System.out.println("Highest grade: " + this.highestGrade);
        System.out.println("Average: " + this.average);
    }
}
