package co.edu.cesde;

public class Accountant {
    String name, identification,leader,parking;
    int age;

    public Accountant() {

    }

    public void person() {

    }

    public Accountant(String name, String identification,String leader,String parking, int age) {
        name = name;
        identification = identification;
        leader=leader;
        parking=parking;
        age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


