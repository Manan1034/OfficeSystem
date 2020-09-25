package org.maven.office.Base;

public class Department 
{
	private String departmentname;
    private int departmentid;
    private String departmentsupervisor;

    public Department(String departmentname,int departmentid,String departmentsupervisor)
    {
        this.departmentname=departmentname;
        this.departmentid=departmentid;
        this.departmentsupervisor=departmentsupervisor;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public int getDepartmentid() {
        return departmentid;
    }

    public String getDepartmentsupervisor() {
        return departmentsupervisor;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public void setDepartmentid(int departmentid) {
        this.departmentid = departmentid;
    }

    public void setDepartmentsupervisor(String departmentsupervisor) {
        this.departmentsupervisor = departmentsupervisor;
    }


}
