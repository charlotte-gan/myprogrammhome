import java.util.*;

public class Main {
    public static void main(String[]args) {
        int way;
        List<gradeManagementSystem2> student = new ArrayList<>();
        while(true) {
            System.out.println("welcome to the Grade Manage System");
            System.out.println("please choose the things you want to do(1:Upload results;2:Teacher's score review;3:Student results review");
            Scanner scan = new Scanner(System.in);
            way = scan.nextInt();
            switch(way) {
                case 1:
                    
                    double StudentNum;
                    int i;
                    
                    System.out.println("please enter the number of the student:");
                    StudentNum = scan.nextDouble();
                    for(i=0;i<StudentNum;i++) {
                        System.out.println("please enter the "+(i+1)+" student's information:");
                        String studentName = scan.next();
                        String studentId = scan.next();
                        double score = scan.nextDouble();
                        student.add(new gradeManagementSystem2(studentName, studentId, score));
                    }
                    student.forEach(System.out::println);
                    break;
                case 2:
                    if (!student.isEmpty()) {
                        teacherSearching teacherSearch = new teacherSearching();
                        teacherSearch.Preparing_words(student);
                    }
                    else {
                        System.out.println("No student information available. Please upload results first.");
                    }
                    break;
                case 3:
                    studentplatform studentplatform = new studentplatform();
                    studentplatform.Enter_information(student);
                    break;
            }
        }
        

    
    }
}