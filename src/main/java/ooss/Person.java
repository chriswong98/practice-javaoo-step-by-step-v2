package ooss;

public class Person {

    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age){
        this.id= id;
        this.name = name;
        this.age = age;
    }


    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        return id == person.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
