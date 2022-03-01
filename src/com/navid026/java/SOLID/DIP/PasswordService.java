package com.navid026.java.SOLID.DIP;

import com.navid026.java.SOLID.OCP.MD5Hasher;

public class PasswordService {
    private final MD5Hasher hasher = new MD5Hasher();

    void hashPassword(String password) {
        hasher.hashPassword(password);
    }
}
