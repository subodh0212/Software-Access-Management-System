package com.project.model;

public class AccessRequest {

    private String empId;
    private String empName;
    private String software;
    private String justification;
    private String requestedAccess;

    public AccessRequest(String empId, String empName,
                         String software, String justification,
                         String requestedAccess) {
        this.empId = empId;
        this.empName = empName;
        this.software = software;
        this.justification = justification;
        this.requestedAccess = requestedAccess;
    }

    public String getEmpId() { return empId; }
    public String getEmpName() { return empName; }
    public String getSoftware() { return software; }
    public String getJustification() { return justification; }
    public String getRequestedAccess() { return requestedAccess; }
}
