package co.edu.cesde;

public class Watchman {
    String name, identification,weapon,workday;
    int age;

    public Watchman() {

    }

    public void person() {

    }

    public Watchman(String name, String identification, String weapon,String workday, int age) {
        name = name;
        identification = identification;
        weapon=weapon;
        workday=workday;
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

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWorkday() {
        return workday;
    }

    public void setWorkday(String workday) {
        this.workday = workday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
