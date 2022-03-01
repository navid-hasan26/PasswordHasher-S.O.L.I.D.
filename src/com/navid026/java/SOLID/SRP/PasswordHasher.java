package com.navid026.java.SOLID.SRP;

public class PasswordHasher {

    public String hashAndSavePassword(String password) {
        hashPassword();
        savePassword();
    }

    public void hashPassword() {
        //hashing implementation
    }

    public void savePassword() {
        //save pass to the database
    }
}
