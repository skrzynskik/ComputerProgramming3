import java.util.Arrays;
import java.util.Random;

public class StudentGrades {

    String studentName;
    double[] gradesExample = {2.0,2.5,3.0,3.5,4.0,4.5,5.0,5.5};
    double[] grades;
    double lowestGrade;
    double highestGrade;
    int numberOfGrades;
    float average;
    
    public StudentGrades(String name, int numberOfGrades) {
        this.studentName = name;
        
        double[] generatedGrades = new double[numberOfGrades];
        
        for (int i=0;i<numberOfGrades;i++){
            generatedGrades[i] = gradesExample[(int) ((Math.random() * (7)) + 0)];
        }
        
        this.grades = generatedGrades;
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
