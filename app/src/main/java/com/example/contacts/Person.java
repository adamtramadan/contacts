package com.example.contacts;

public class Person {

    private  String  name;
    private  String  number ;
    private  String  address;

    public Person(){}
    public Person(String name,  String number, String address)
    {
        this.name = name;
        this.number = number;
        this.address = address;


    }
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

}
