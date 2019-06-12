package practice11;


import java.util.HashSet;
import java.util.Set;

public class Klass {
    int number;
    Student leader;
    Set<Student> member;
    Set<Teacher> teachers;

    public Klass(int number) {
        this.number = number;
        member = new HashSet<>();
        teachers = new HashSet<>();
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
            notifyTeachers(String.format("%s become Leader of %s.", student.getName(), getDisplayName()));
        }
        else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student){
        member.add(student);
        notifyTeachers(String.format("%s has joined %s.", student.getName(), getDisplayName()));
    }

    public void notifyTeachers(String message){
        for (Teacher teacher : teachers){
            teacher.getMessage(message);
        }
    }

    public void appendTeather(Teacher teacher){
        teachers.add(teacher);
    }

    public boolean isIn(Student student){
        return this == student.getKlass();
    }
}
