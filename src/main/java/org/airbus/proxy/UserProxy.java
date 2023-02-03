package org.airbus.proxy;

import java.security.MessageDigest;

public abstract class UserProxy implements IAccess {

    private final EntertainmentSystemImpl entertainmentSystem;

    public UserProxy(String username, String password) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] hash = messageDigest.digest(password.getBytes("UTF-8"));
            String encodedPassword = new String(hash);

            String userGroup;
            if (username.equals("purser") && encodedPassword.equals("8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918")) {
                userGroup = "purser";
                entertainmentSystem = new EntertainmentSystemImpl();
            } else if (username.equals("servicetechnician") && encodedPassword.equals("3c9909afec25354d551dae21590bb26e38d53f2173b8d3dc3eee4c047e7ab1c1")) {
                userGroup = "servicetechnician";
                entertainmentSystem = new EntertainmentSystemImpl();
            }
        } catch (Exception e) {

        }



    }

}