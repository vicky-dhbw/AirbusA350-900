package org.airbus.proxy;


import java.util.HashMap;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EntertainmentSystemProxy {
    private static HashMap<String, String> users = new HashMap<>();
    private static HashMap<String, String> userGroups = new HashMap<>();
    private static EntertainmentSystem entertainmentSystem = new EntertainmentSystem() {

    static {
        users.put("purser", "SHA256HashOfPassword");
        users.put("servicetechnician", "SHA256HashOfPassword");
        userGroups.put("purser", "Purser");
        userGroups.put("servicetechnician", "Servicetechniker");
    }

    public static boolean authenticate(String username, String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(password.getBytes());
            byte[] digest = md.digest();
            StringBuilder hexString = new StringBuilder();
            for (byte b : digest) {
                hexString.append(String.format("%02x", b & 0xff));
            }
            return hexString.toString().equals(users.get(username));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void selectTitle(String username, String title, String type) {
        if (userGroups.get(username).equals("Passagier")) {
            entertainmentSystem.selectTitle(title, type);
        }
    }

    public static void start(String username) {
        if (userGroups.get(username).equals("Purser") || userGroups.get(username).equals("Servicetechniker")) {
            entertainmentSystem.start();
        }
    }

    public static void reset(String username) {
        if (userGroups.get(username).equals("Purser") || userGroups.get(username).equals("Servicetechniker")) {
            entertainmentSystem.reset();
        }
    }

    public static void shutDown(String username) {
        if (userGroups.get(username).equals("Purser") || userGroups.get(username).equals("Servicetechniker")) {
            entertainmentSystem.shutDown();
        }
    }

    public static void addTitle(String username, String title, String type) {
        if (userGroups.get(username).equals("Servicetechniker")) {
            entertainmentSystem.addTitle(title, type);
        }
    }

    public static void removeTitle(String username, String title, String type) {
        if (userGroups.get(username).equals("Servicetechniker")) {
            entertainmentSystem.removeTitle(title, type);
        }
    }

    public static void analyzeUserBehavior(String username) {
        if (userGroups.get(username).equals("Servicetechniker")) {
            entertainmentSystem.analyzeUserBehavior();
        }
    }

    public void selectTitle(String title, String type) {
        System.out.println("Selected title: " + title + " of type " + type);
    }

    public void start() {
        System.out.println("Entertainment System started");
    }

    public void reset() {
        System.out.println("Entertainment System reset");
    }

    public void shutDown() {
        System.out.println("Entertainment System shut down");
    }

    public void addTitle(String title, String type) {
        System.out.println("Title added: " + title + " of type " + type);
    }

    public void removeTitle(String title, String type) {
        System.out.println("Title removed: " + title + " of type " + type);
    }

    public void analyzeUserBehavior() {
        System.out.println("User behavior analyzed");
    }
}
