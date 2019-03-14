package com.example.demo;

public class PersonMould {

    private String memberId;
    private String firstName;
    private String lastName;
    private int age;


    public PersonMould() {
    }



    public PersonMould(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }



    public PersonMould(String memberId, String firstName, String lastName, int age) {
        this.memberId = memberId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


   /* public void addMember(String firstName, String lastName, int age){

        PersonMould personMould = new PersonMould(firstName, lastName, age);

    }*/

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




    @Override
    public String toString() {
        String info = String.format("memberId = %s, firstName = %s, lastName = %s, age = %d", memberId, firstName, lastName
                , age);
        return info;
    }
}