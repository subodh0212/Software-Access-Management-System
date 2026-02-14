package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.project.model.AccessRequest;
import com.project.util.DBConnectionUtil;

public class AccessRequestDAO {

    public void save(AccessRequest r) {

        String sql =
                "INSERT INTO access_request " +
                "(employee_id, employee_name, software_name, justification, requested_access, status) " +
                "VALUES (?, ?, ?, ?, ?, 'PENDING')";

        try (Connection con = DBConnectionUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, r.getEmpId());
            ps.setString(2, r.getEmpName());
            ps.setString(3, r.getSoftware());
            ps.setString(4, r.getJustification());
            ps.setString(5, r.getRequestedAccess());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void approve(int id, String access) {

        String sql =
                "UPDATE access_request " +
                "SET approved_access=?, status='APPROVED', in_time=NOW() " +
                "WHERE request_id=?";

        try (Connection con = DBConnectionUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, access);
            ps.setInt(2, id);
//          ps.executeUpdate();
            int rows = ps.executeUpdate();
            System.out.println("Rows updated: " + rows);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void revoke(int id) {

        String sql =
                "UPDATE access_request SET " +
                "out_time=NOW(), " +
                "total_minutes=TIMESTAMPDIFF(MINUTE,in_time,NOW()), " +
                "status='REVOKED' WHERE request_id=?";

        try (Connection con = DBConnectionUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
