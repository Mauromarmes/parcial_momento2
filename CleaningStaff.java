package co.edu.cesde;

public class CleaningStaff {
    String name, identification,dayOff;
    int age;

    public CleaningStaff() {

    }

    public void person() {

    }

    public CleaningStaff(String name, String identification, String dayOff, int age) {
        name = name;
        identification = identification;
        dayOff=dayOff;
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

    public String getDayOff() {
        return dayOff;
    }

    public void setDayOff(String dayOff) {
        this.dayOff = dayOff;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
