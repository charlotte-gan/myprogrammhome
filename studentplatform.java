import java.util.*;
public class studentplatform {


    public void Enter_information(List<gradeManagementSystem2> students) {
        Scanner scan = new Scanner(System.in);
        System.out.println("welcome to the student's searching platform");
        System.out.println("please enter your id: ");
        String id = scan.nextLine();
        System.out.println("please enter your passport:");;
        String passport = scan.nextLine();
        int index = findStudentIndexById(students,id);
        teacherSearching teacherSearch = new teacherSearching();
        if (index != -1) {
            teacherSearch.a(students, index);
        } 
        else {
            System.out.println("No student found with the given Id.");
        }
    }
    private int findStudentIndexById(List<gradeManagementSystem2>students,String id) {
        int i;
        for(i=0;i<students.size();i++) {
            if(students.get(i).getStudentId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
