package practice11;

public class Person {
    int id;
    String name;
    int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String introduce(){
        return String.format("My name is %s. I am %s years old.", name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person person= (Person) obj;
            return id == person.getId();
        }
        return false;
    }
}
