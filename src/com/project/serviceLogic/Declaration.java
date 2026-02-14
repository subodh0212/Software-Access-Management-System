package com.project.serviceLogic;

public class Declaration {
	 private int id;
	    private int age;
	    private String fname;
	    private String lname;

	    public Declaration() {}

	    public Declaration(int id, int age, String fname, String lname) {
	        this.id = id;
	        this.age = age;
	        this.fname = fname;
	        this.lname = lname;
	    }
	    
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getFname() {
	        return fname;
	    }

	    public void setFname(String fname) {
	        this.fname = fname;
	    }

	    public String getLname() {
	        return lname;
	    }

	    public void setLname(String lname) {
	        this.lname = lname;
	    }


        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", age=" + age +
                    ", fname='" + fname + '\'' +
                    ", lname='" + lname + '\'' +
                    '}';
        }

}
