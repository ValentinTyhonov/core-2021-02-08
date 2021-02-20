package com.company.core.lesso03;

public class Student extends Person
{
    private String university;
    private String group;

    Student(String university, String group, String name, String surname, int age)
    {
        super(name, surname, age);
        this.university = university;
        this.group = group;
    }

    public String getUniversity()
    {
        return university;
    }

    public void setUniversity(String university)
    {
        this.university = university;
    }

    public String getGroup()
    {
        return group;
    }

    public void setGroup(String group)
    {
        this.group = group;
    }

    @Override
    public boolean isAdult() {
        return !university.isEmpty() && getAge() >= 17;
    }

    @Override
    public void hello()
    {
        System.out.println("");
    }

    @Override
    public String toString()
    {
        return "Student{" +
            "university='" + university + '\'' +
            ", group='" + group + '\'' +
            '}';
    }
}
