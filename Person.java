package co.edu.cesde;


public class Person {
    String name,identification;
    int age;

    public Person() {

    }

    public void person(){

    }

    public Person(String name,String identification, int age) {
        name = name;
        identification=identification;
        age=age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
