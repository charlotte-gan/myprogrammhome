import java.util.*;
public class gradeManagementSystem1 {
    private String studentName;
    private String studentId;
    private double score;
    public gradeManagementSystem1() {

    }
    public gradeManagementSystem1(String studentName,String studentId,double score) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.score = score;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "student{"+
                "studentName='"+studentName+'\''+ 
                ", studentId = '" + studentId+'\''+
                ", score = " + score + '}';

    }
    public static void main(String[]args) {
        System.out.print("plese enter the information:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String id = scan.nextLine();
        double score= scan.nextDouble();
        gradeManagementSystem1 student = new gradeManagementSystem1(name,id,score);
        System.out.println(student);
        student.setScore(90);
        System.out.println(student);
    }
}


