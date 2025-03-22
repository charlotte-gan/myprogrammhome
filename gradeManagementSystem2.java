public class gradeManagementSystem2 {
    private String StudentName;
    private String StudentId;
    private double score;
    
    public gradeManagementSystem2() {

    }
    
    public gradeManagementSystem2(String StudentName,String StudentId,double score) {
        this.StudentName=StudentName;
        this.StudentId=StudentId;
        this.score=score;
    }

    //getter，用于之后给像学生或老师查成绩或者什么用
    public String getStudentName() {
        return StudentName;
    }
    public String getStudentId() {
        return StudentId;
    }
    public double getScore() {
        return score;
    }

    //setter,用于重新给成员变量赋值
    public void setStudentName(String StudentName) {
        this.StudentName=StudentName;
    }
    public void setStudentId(String StudentId) {
        this.StudentId=StudentId;
    }
    public void setscore(double score) {
        this.score=score;
    }

    public String toString() {
        return "student{" +
        "studentName='" + StudentName + '\'' +
        ", studentId = '" + StudentId + '\'' +
        ", score = " + score + '}';
    }
}
