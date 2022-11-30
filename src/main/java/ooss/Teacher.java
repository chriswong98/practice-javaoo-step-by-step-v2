package ooss;

public class Teacher extends Person{

    private int id;
    private String name;
    private int age;
    private Klass klass;

    public Teacher (int id, String name, int age){
        super(id,name,age);
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String introduce() {
        if (klass != null) {
            return "My name is " + name + ". I am " + age + " years old. I am a teacher. I am in class " + klass.getClassNumber() + ".";
        } else {
            return "My name is " + name + ". I am " + age + " years old. I am a teacher.";
        }
    }

    public boolean belongsTo(Klass klass) {
        return this.klass==klass;
    }

    public void assignTo(Klass klass) {
        this.klass=klass;
    }


    public boolean isTeaching(Student tom) {
        return tom.isIn(klass);
    }

    public String getName(){
        return name;
    }
}
