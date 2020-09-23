package _09_Collection.MyLinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        class  Student{
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1,"Lyn");
        Student student2 = new Student(2,"rey");
        Student student3 = new Student(3,"LC");
        Student student4 = new Student(4,"QA");

        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addFirst(student3);
        myLinkedList.addFirst(student4);
//        myLinkedList.remove(2);
        MyLinkedList<Student> cloneLinkedList = myLinkedList.clone();
//        for (int i = 0; i<cloneLinkedList.size(); i++){
//            Student student = (Student) cloneLinkedList.get(i);
//            System.out.println(student.getName());
//        }
        System.out.println(myLinkedList.indexOf(student1));
    }
}
