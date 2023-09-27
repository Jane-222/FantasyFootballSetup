/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fantasyfootballsetup;

/**
 *
 * @author zhiya
 */
public abstract class Player {
    private String fname;
    private String lname;
    private String country;// don't need to change and is not allow to change!
    private int age;
    private String position;

    public Player(String fname, String lname, String country, int age, String position) {
        this.fname = fname;
        this.lname = lname;
        this.country = country;
        this.age = age;
        this.position = position;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }
    
}
//class= make object to class.