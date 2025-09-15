import java.util.List;

public class AssociationTeacher {
    private String name;
    public List<EncapStudent> students;
    public AssociationTeacher(String n, List<EncapStudent> listl){
        this.name = n;
        this.students = listl;
    }

    public void ShowName(){
        displayOnly(name);
    for(EncapStudent s:students){
        displayOnly(s.getName());
        }
    }

    public void displayOnly(String s){
        System.out.println("Student name "+s);
    }
}