package com.navid026.java.SOLID.LSP;

import com.navid026.java.SOLID.OCP.MD5Hasher;

public class MD5 extends com.navid026.java.SOLID.Hashed.Hashed {
    public MD5() {
        this.passwordHasher = new MD5Hasher();
    }
}
