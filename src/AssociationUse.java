import java.lang.reflect.Array;
import java.util.Arrays;

public class AssociationUse {

    public static void main(String[] args){
        EncapStudent st1 = new EncapStudent(1,"Dhiman");
        EncapStudent st2 = new EncapStudent(2,"Suman");
        AssociationTeacher teacher = new AssociationTeacher("Bikash", Arrays.asList(st1,st2));
        teacher.ShowName();
    }
}
