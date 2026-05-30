class Student {
    private int id;
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
}
class StudentID_Encapsulation {
    public static void main(String args[]) {

        Student st = new Student();

        st.setId(10);

        System.out.print(st.getId());
    }
}
