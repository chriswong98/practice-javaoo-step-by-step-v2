package ooss;

public class Student extends Person{

    private int id;
    private String name;
    private int age;
    private Klass klass;
    public Student (int id, String name, int age){
        super(id,name,age);
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String introduce() {
        if (klass != null) {
            return "My name is " + name + ". I am " + age + " years old. I am a student. I am in class " + klass.getClassNumber() + ".";
        } else {
            return "My name is " + name + ". I am " + age + " years old. I am a student.";
        }
    }

    public boolean isIn(Klass klass) {
        return this.klass==klass;
    }

    public void join(Klass klass) {
        this.klass=klass;
    }



}
