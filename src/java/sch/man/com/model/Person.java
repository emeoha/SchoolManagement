/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sch.man.com.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity; 
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author LEOGOLD
 */
@Entity
@Table (name= "Person")
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "personId")
    private String personId;
    
    @Column(name = "First_Name")
     private String firstname;
    
    @Column(name = "Last_name")
     private String lastname;
    
    @Column(name = "Gender")
     private String gender;
    
    @Column(name = "Date_Of_Birth")
     private String dob;
    
    @Column(name = "Address")
     private String address;
    
    @Column(name = "Phone")
     private String phone;
    
    @Column(name = "Email")
     private String email;
    
    @Column(name = "Password")
     private String password;

    public Person() {
    }

    public Person(String personId, String password) {
        this.personId = personId;
        this.password = password;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Studentdetail{" + "personId=" + personId + ", firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender + ", dob=" + dob + ", address=" + address + ", phone=" + phone + ", email=" + email + ", password=" + password + '}';
    }
     

}
