import java.util.*;
public class teacherSearching {
    public void Preparing_words (List<gradeManagementSystem2> students) {
        System.out.println("welcome to the teacher searching platform");
        System.out.println("please choose the direction in which you wish to search(name or id or score)");
        String direction;
        Scanner scan = new Scanner(System.in);
        direction = scan.nextLine();
        switch(direction) {
            case "name":
                String name;
                System.out.println("please enter the student's name:");
                name = scan.nextLine();
        
                int index = findStudentIndexByName(students, name);
                if (index != -1) {
                    a(students, index);
                } else {
                    System.out.println("No student found with the given name.");
                }
                break;
            case "id":
          
                String Id;
                System.out.println("please enter the student's Id:");
                Id = scan.nextLine();
        
                index = findStudentIndexById(students,Id);
                if (index != -1) {
                    a(students, index);
                } else {
                    System.out.println("No student found with the given Id.");
                }
                break;
            case "score":
                double score;
                System.out.println("please enter the student's score:");
                score = scan.nextDouble();
        
                index = findStudentIndexByScore(students,score);
                if (index != -1) {
                    a(students, index);
                } else {
                    System.out.println("No student found with the given score.");
                }
                break;
      
        }
    }
    public void a(List<gradeManagementSystem2> students, int index) {
        gradeManagementSystem2 student = students.get(index);
        String name = student.getStudentName();
        System.out.println("the student name is:"+name);

        String id = student.getStudentId();
        System.out.println("the student id is:" + id);

        double score = student.getScore();
        System.out.println("the student score is:" + score);
    }


    private int findStudentIndexByName(List<gradeManagementSystem2>students,String name) {
        int i;
        for(i=0;i<students.size();i++) {
            if(students.get(i).getStudentName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
    private int findStudentIndexById(List<gradeManagementSystem2>students,String Id) {
        int i;
        for(i=0;i<students.size();i++) {
            if(students.get(i).getStudentId().equals(Id)) {
                return i;
            }
        }
        return -1;
    }
    private int findStudentIndexByScore(List<gradeManagementSystem2>students,double score) {
        int i;
        for(i=0;i<students.size();i++) {
            if(students.get(i).getScore()==score) {
                return i;
            }
        }
        return -1;
    }
}
