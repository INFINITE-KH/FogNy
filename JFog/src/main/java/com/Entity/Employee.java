package com.Entity;

public class Employee {
    
    int id;
    String ename;
    int ephone;
    String password;

    public Employee(int id, String ename, int ephone, String password) {
        this.id = id;
        this.ename = ename;
        this.ephone = ephone;
        this.password = password;
    }

    public Employee(int id, String ename, int ephone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Employee(int id, String password) {
        this.id = id;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEphone() {
        return ephone;
    }

    public void setEphone(int ephone) {
        this.ephone = ephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", ename=" + ename + ", ephone=" + ephone + ", password=" + password + '}';
    }
    
}
