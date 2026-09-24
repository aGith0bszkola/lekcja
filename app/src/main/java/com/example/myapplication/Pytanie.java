package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

public class Pytanie {
    @SerializedName("tresc")
    private String trescPytania;
    @SerializedName("odp_a")
    private String opdaA;
    @SerializedName("odb_b")
    private String odpB;

    public String getTrescPytania() {
        return trescPytania;
    }

    public String getOpdaA() {
        return opdaA;
    }

    public String getOdpB() {
        return odpB;
    }

    public void setTrescPytania(String trescPytania) {
        this.trescPytania = trescPytania;
    }

    public void setOpdaA(String opdaA) {
        this.opdaA = opdaA;
    }

    public void setOdpB(String odpB) {
        this.odpB = odpB;
    }

    public void setOdpC(String odpC) {
        this.odpC = odpC;
    }

    public void setOdp_poprawna(int odp_poprawna) {
        this.odp_poprawna = odp_poprawna;
    }

    public String getOdpC() {
        return odpC;
    }

    public int getOdp_poprawna() {
        return odp_poprawna;
    }

    public Pytanie(String trescPytania, String opdaA, String odpB, String odpC, int odp_poprawna) {
        this.trescPytania = trescPytania;
        this.opdaA = opdaA;
        this.odpB = odpB;
        this.odpC = odpC;
        this.odp_poprawna = odp_poprawna;
    }

    @SerializedName("odb_c")
    private String odpC;
    private int odp_poprawna;
}
