package com.project.service;

import com.project.dao.AccessRequestDAO;
import com.project.model.AccessRequest;

public class AccessService {

    private AccessRequestDAO dao = new AccessRequestDAO();

    public void requestAccess(String empId, String empName,
                              String software, String justification,
                              String accessType) {

        AccessRequest req = new AccessRequest(
                empId, empName, software, justification, accessType
        );

        dao.save(req); 
    }

    public void approveAccess(int requestId, String accessType) {
        dao.approve(requestId, accessType);
    }

    public void revokeAccess(int requestId) {
        dao.revoke(requestId);
    }
}
