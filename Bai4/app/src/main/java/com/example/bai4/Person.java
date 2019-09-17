package com.example.bai4;

import androidx.annotation.NonNull;

public class Person {
    private String hoVaTen;
    private String cmnd;
    private String bangCap;
    private String soThich;
    private String thongTinBoSung;

    public Person(String hoVaTen, String cmnd, String bangCap, String soThich, String thongTinBoSung) {
        super();
        this.hoVaTen = hoVaTen;
        this.cmnd = cmnd;
        this.bangCap = bangCap;
        this.soThich = soThich;
        this.thongTinBoSung = thongTinBoSung;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }

    public String getBangCap() {
        return bangCap;
    }

    public void setBangCap(String bangCap) {
        this.bangCap = bangCap;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getThongTinBoSung() {
        return thongTinBoSung;
    }

    public void setThongTinBoSung(String thongTinBoSung) {
        this.thongTinBoSung = thongTinBoSung;
    }

    @NonNull
    @Override
    public String toString() {
        return String.format("{HoVaTen: %s, CMND: %s}", this.hoVaTen, this.cmnd);
    }
}
