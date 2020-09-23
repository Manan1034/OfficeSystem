package org.maven.officesystem.organization.Base;

public class Employee extends Department 
{
	private String employeename;
    private String employeeid;
    private int age;
    private String gender;

    public Employee(String employeename,String employeeid,int age,String gender,String departmentname, int dptid, String supervisor)
    {
        super(departmentname,dptid,supervisor);
        this.employeename=employeename;
        this.employeeid=employeeid;
        this.age=age;
        this.gender=gender;
    }

    public String getEmployeename() {
        return employeename;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setDepartmentname(String departmentname) {
        super.setDepartmentname(departmentname);
    }

    @Override
    public void setDepartmentid(int departmentid) {
        super.setDepartmentid(departmentid);
    }

    @Override
    public void setDepartmentsupervisor(String departmentsupervisor) {
        super.setDepartmentsupervisor(departmentsupervisor);
    }

    @Override
    public String getDepartmentname() {
        return super.getDepartmentname();
    }

    @Override
    public int getDepartmentid() {
        return super.getDepartmentid();
    }

    @Override
    public String getDepartmentsupervisor() {
        return super.getDepartmentsupervisor();
    }


}
