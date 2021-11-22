import java.util.Arrays;

public class StudentGrades {

    String studentName;
    double[] grades;
    double lowestGrade;
    double highestGrade;
    int noOfGrades;
    float average;
    
    public StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
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
        
        this.noOfGrades = this.grades.length;
        
    }
    
    public void findAverage(){
        double sum = 0;
        
        for (int i=0; i<this.grades.length;i++){
            sum += this.grades[i];
        }
        
        this.average = (float) sum/this.noOfGrades;
    }
    
    public void displayInformation(){
        System.out.println("Name: " + this.studentName);
        System.out.println("Grades: " + Arrays.toString(this.grades));
        System.out.println("Number of grades: " + this.noOfGrades);
        System.out.println("Lowest grade: " + this.lowestGrade);
        System.out.println("Highest grade: " + this.highestGrade);
        System.out.println("Average: " + this.average);
    }
}
