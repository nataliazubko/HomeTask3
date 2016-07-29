/**
 * Created by 1 on 06.07.2016.
 */
public class Teacher extends Person{
    double salary;
    String subject;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    public Teacher(String name, int age, String gender, double salary, String subject) {
        super(name, age, gender);
        this.salary = salary;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return  super.toString() +", "+
                "salary:" + salary +
                ", subject: " + subject;
    }
}
