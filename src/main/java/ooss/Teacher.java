package ooss;

public class Teacher extends Person{

    private int id;
    private String name;
    private int age;

    public Teacher (int id, String name, int age){
        super(id,name,age);
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old. I am a teacher.";
    }





}
