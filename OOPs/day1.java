
class student {

    String name;
    int roll;
    String college;

    public student() {

    }

    public student(String name, int roll, String college) {
        this.name = name;
        this.roll = roll;
        this.college = college;
    }

    @Override
    public String toString() {
        return "Name= " + name + " RollNo= " + roll + " college= " + college;
    }
}

public class day1 {

    public static void main(String[] args) {

        student s1 = new student("Aniket Singh", 9322, "SOA");
        student s2 = new student("Vicky Singh", 2141, "ITER");

        System.out.println(s1);
        System.out.println(s2);

    }
}
