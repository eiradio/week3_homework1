package practice11;


import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
   List<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        for (Klass klass : classes){
            klass.appendTeather(this);
        }
    }

    public List<Klass> getClasses() {
        return classes;
    }

    public void setClasses(List<Klass> classes) {
        this.classes = classes;
    }

    public String basicIntroduce(){
        return String.format("%s I am a Teacher.", super.introduce());
    }

    @Override
    public String introduce() {
        return String.format("%s I teach %s.", basicIntroduce(), (classes == null ? "No Class" : "Class" + classes.stream().map(klass -> " " + klass.getNumber()).collect(Collectors.joining(","))));
    }

    public boolean isTeaching(Student student){
        for (Klass klass : classes){
            if (klass.isIn(student)) return true;
        }
        return false;
    }

    public String introduceWith(Student student){
        return String.format("%s I%steach %s.", basicIntroduce(), (isTeaching(student) ? " " : " don't "), student.getName());
    }

    public void getMessage(String message){
        System.out.print(String.format("I am %s. I know %s\n", name, message));
    }



}
