package com.sakib635.sakibsfoodvalley.Model.customerFoodPanel;

public class Customer {


    private String City,ConfirmPassword,EmailID,FirstName,LastName,Mobileno,Password,State,Area;

    public Customer() {


    }

    public Customer(String City, String confirmPassword, String emailID, String firstName,String lastName, String mobileno, String password, String state, String area) {
        this.City = City;
        ConfirmPassword=confirmPassword;
        EmailID = emailID;
        FirstName=firstName;
        LastName=lastName;
        Mobileno = mobileno;
        Password = password;
        State = state;
        Area = area;

    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        ConfirmPassword = confirmPassword;
    }

    public String getEmailID() {
        return EmailID;
    }

    public void setEmailID(String emailID) {
        EmailID = emailID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getMobileno() {
        return Mobileno;
    }

    public void setMobileno(String mobileno) {
        Mobileno = mobileno;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

}
