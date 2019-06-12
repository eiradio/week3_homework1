package practice07;

import practice05.Person;

public class Student extends Person {
    Klass klass;

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return String.format("%s I am a Student. I am at %s.", super.introduce(), klass.getDisplayName());
    }
}
