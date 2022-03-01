package com.navid026.java.SOLID.OCP;

import com.navid026.java.SOLID.ISP.Decryptable;

public class MD5Hasher implements PasswordHasher, Decryptable {
    @Override
    public String hashPassword(String password) {
        return "Hashed with MD5";

    }

    @Override
    public String decodePasswordFromHash(String hash) {
        return "Decoded from MD5";
    }
}