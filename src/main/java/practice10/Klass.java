package practice10;


import java.util.HashSet;
import java.util.Set;

public class Klass {
    int number;
    Student leader;
    Set<Student> member;

    public Klass(int number) {
        this.number = number;
        member = new HashSet<>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public String getDisplayName(){
        return String.format("Class %d", number);
    }

    public void assignLeader(Student student){
        if (member.contains(student)) {
            this.leader = student;
        }
        else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student){
        member.add(student);
    }

    public boolean isIn(Student student){
        return this == student.getKlass();
    }
}
