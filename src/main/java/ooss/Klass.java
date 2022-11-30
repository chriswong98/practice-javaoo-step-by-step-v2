package ooss;

public class Klass {

    private int number;
    private Student leader;
    public Klass(int number){
        this.number = number;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Klass)) return false;

        Klass klass = (Klass) o;

        return number == klass.number;
    }

    @Override
    public int hashCode() {
        return number;
    }

    public int getClassNumber() {
        return number;
    }


    public boolean isLeader(Student leader) {
        return this.leader==leader;
    }

    public void assignLeader(Student leader) {
        if(leader.isIn(this)) {
            this.leader = leader;
        }
        else{
            System.out.println("It is not one of us.");
        }
    }
}
