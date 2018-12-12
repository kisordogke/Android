package com.example.user.hazi_het;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Animals implements Serializable {

    private int ikon;
        private String nev;
    private String desc;

    public Animals(int Rikon, String PNev, String Pdesc) {
        ikon = Rikon;
        nev = PNev;
        desc = Pdesc;
    }


    public int getaDrawable() { return ikon;}
    public String getNev() { return nev; }
    public String getDesc() { return desc; }

    public static List<Animals> getAnimals() {
        List<Animals> allat = new ArrayList<>();
        allat.add(new Animals(R.drawable.cat, "Cat", "Macska"));
        allat.add(new Animals(R.drawable.disznyo, "Pag", "Sertes"));
        allat.add(new Animals(R.drawable.dog, "Dog", "Kutya"));
        allat.add(new Animals(R.drawable.giraffe, "Giraffe", "Zsiraf"));
        allat.add(new Animals(R.drawable.horse, "Horse", "Lo"));
        allat.add(new Animals(R.drawable.lion, "Lion", "Oroszlan"));
        allat.add(new Animals(R.drawable.rabbit, "Rabbit", "Nyul"));
        allat.add(new Animals(R.drawable.sheep, "Sheep", "Barany"));
        allat.add(new Animals(R.drawable.octopus, "Octopus", "Polip"));
        return allat;
    }
}