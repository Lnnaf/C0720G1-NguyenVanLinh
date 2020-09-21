package _09_Collection.Exercise;

public class TestMyList {
    public static class Student{
        private int id;
        private String name;

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
    public static void main(String[] args) {
        Student a = new Student(1,"Huy");
        Student b = new Student(2,"jonh");
        Student c = new Student(3,"Kim");
        Student d = new Student(4,"Uy");
        Student e = new Student(5,"Can");

        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);
//        studentMyList.clear();

        for(int i = 0; i < studentMyList.size(); i++){
            Student student =(Student) studentMyList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
//        System.out.println(studentMyList.size());
        System.out.println(studentMyList.indexOf(c));
    }
}
