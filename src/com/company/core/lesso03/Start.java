package com.company.core.lesso03;

public class Start
{
    private static final String KDKD_FDFD = "dffv";

    public static void main(String[] args)
    {
        Car car = new Car(KDKD_FDFD, new Engine());
        Passanger[] passangers = {new Passanger(), new Passanger()};
        car.setPassangers(passangers);

        Student stud = new Student("NULP", "KN", "Tom", "Bib", 19);
        Student stud1 = new Student("NULP", "KN", "Tom", "Bib", 19);

        System.out.println(stud.equals(stud1));
        System.out.println(stud.hashCode());
        System.out.println(stud1.hashCode());

        System.out.println(stud);

        Student.say("fwesef");
        Person.say("efg");
    }
}
