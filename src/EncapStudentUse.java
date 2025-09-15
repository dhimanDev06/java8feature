public class EncapStudentUse{
    public static void main(String[] args){
        EncapStudent st = new EncapStudent(1,"Dhiman");
        System.out.println("Name "+st.getName());
        System.out.println("Id "+st.getId());
        st.setId(6);
        System.out.println("Id "+st.getId());
    }
}