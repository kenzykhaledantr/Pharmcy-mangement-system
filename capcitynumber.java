package com.mycompany.loginform;

public class capcitynumber {
    private static int capacity;
    public static double Totalinday;
    public static double cosmeticsprice;

    public capcitynumber(int capacity) {
        this.capacity = capacity;
    }

    public capcitynumber() {
    }

    public static int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
