package com.project.main;
import java.util.Scanner;

import com.project.service.AccessService;

public class MainApp {

    public static void main(String[] args) throws Exception {

        AccessService service = new AccessService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Request Access");
            System.out.println("2.Approve Access");
            System.out.println("3.Revoke Access");
            System.out.println("4.Exit");

            switch (sc.nextInt()) {

                case 1:
                    sc.nextLine();
                    System.out.print("Emp ID: ");
                    String id = sc.nextLine();
                    System.out.print("Emp Name: ");
                    String name = sc.nextLine();
                    System.out.print("Software: ");
                    String sw = sc.nextLine();
                    System.out.print("Justification: ");
                    String just = sc.nextLine();
                    System.out.print("Access Type: ");
                    String at = sc.nextLine();

                    service.requestAccess(id, name, sw, just, at);
                    System.out.println("Request Submitted");
                    break;

                case 2:
                    System.out.print("Request ID: ");
                    int aid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Approved Access: ");
                    String ap = sc.nextLine();
                    service.approveAccess(aid, ap);
                    System.out.println("Access Approved");
                    break;

                case 3:
                    System.out.print("Request ID: ");
                    service.revokeAccess(sc.nextInt());
                    System.out.println("Access Revoked");
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
