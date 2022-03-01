package com.navid026.java.SOLID.Hashed;

import com.navid026.java.SOLID.OCP.MD5Hasher;
import com.navid026.java.SOLID.SRP.PasswordHasher;

public abstract class Hashed
{
    protected MD5Hasher passwordHasher;
    //PasswordHasher passwordHasher;
    String hash;

    public void generateHash(String password)
    {
        hash = passwordHasher.hashPassword(password);
    }
}
