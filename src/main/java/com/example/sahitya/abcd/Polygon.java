package com.example.sahitya.abcd;

interface Polygon {
    void area();

    default int lala() {
        return 1;
    }
}
