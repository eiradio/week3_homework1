package practice08;

public class Teacher extends Person {
    Klass klass;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String basicIntroduce(){
        return String.format("%s I am a Teacher.", super.introduce());
    }

    @Override
    public String introduce() {
        return String.format("%s I teach %s.", basicIntroduce(), (klass != null ? klass.getDisplayName() : "No Class"));
    }


    public String introduceWith(Student student){
        return String.format("%s I%steach %s.", basicIntroduce(), (student.getKlass().getNumber() == klass.getNumber() ? " " : " don't "), student.getName());
    }
}
