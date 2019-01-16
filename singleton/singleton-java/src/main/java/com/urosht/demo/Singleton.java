package com.urosht.demo;

/**
 * The inner class is referenced no earlier (and therefore loaded no earlier by the class loader) than the moment
 * that getInstance() is called. Which makes this solution thread-safe without requiring special constructs like volatile
 * or synchronized.
 */
public class Singleton {

    private Singleton() {

    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
