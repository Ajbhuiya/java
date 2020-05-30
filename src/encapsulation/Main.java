package encapsulation;

public class Main {

    public static void main(String[] args) {

        Student st = new Student();
        st.setAge(20);
        st.setGender("boys");
        st.setScore(100);
        //st.setName("bj");

        System.out.println(st.getAge());
        System.out.println(st.getGender());
        System.out.println(st.getScore());
        System.out.println(st.getName());

    }
}
