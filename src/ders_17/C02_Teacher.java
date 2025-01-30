package ders_17;

public class C02_Teacher {
    String name = "Default value";
/*
    // Default constructor
    public C02_Teacher() {
    }*/

    // Nonparameter Constructor
    public C02_Teacher() {
        name = "Burak";
    }

    // Parameter Constructor
    public C02_Teacher(String name) {
        this.name = name;
    }
}
