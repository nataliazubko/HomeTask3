/**

 */
public class TestingClass {
    public static void main(String[] args) {
        Person person = new Person("Coach Bob",27, "M");
        Student student = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        Teacher teacher = new Teacher("Duke Java", 34, "M",50000.0,"Computer Science");
        CollegeStudent collegeStudent = new CollegeStudent("Ima Frosh", 18, "F","UCB123", 4.0, 1, "English");

        Person array []= new Person[4];
        array[0]= person;
        array[1]= student;
        array[2]= teacher;
        array[3]= collegeStudent;
        for (Person name: array
             ) {
            System.out.println(name.toString());
            
        }

    }
}
