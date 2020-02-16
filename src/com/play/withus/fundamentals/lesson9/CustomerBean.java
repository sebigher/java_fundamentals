package com.play.withus.fundamentals.lesson9;

// java bean or

/**
 * this is one of the first appearances of
 * "programming to the interface" due the encapsulation
 * (this is de facto the encapsulation:
 * hiding object fields )
 */
public class CustomerBean {
    //1st step: make properties private(access to these properties is only for the class itself: for the class methods )
    private String name;
    private int custId;
    private String address;
    private int age;
    private int phone;


    //by default we have the default constructor(for free)
    //2nd step: provide getters and setters where is appropriate (or use Lombok...grow up)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
