package com.navid026.java.SOLID.OCP;

public class SHA256Hasher implements PasswordHasher {
    @Override
    public String hashPassword(String password) {
        return "Hashed with SHA256";
    }
}
