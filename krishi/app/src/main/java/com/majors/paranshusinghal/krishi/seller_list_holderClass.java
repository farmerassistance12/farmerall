package com.majors.paranshusinghal.krishi;

public class seller_list_holderClass {

    private int id;
    private String phone;
    private String name_crop;
    private String tot_volume;
    private String min_volume;
    private String min_price;
    private String date;

    public seller_list_holderClass(int id, String phone, String name_crop, String tot_volume, String min_volume, String min_price, String date) {
        this.id = id;
        this.phone = phone;
        this.name_crop = name_crop;
        this.tot_volume = tot_volume;
        this.min_volume = min_volume;
        this.min_price = min_price;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public String getName_crop() {
        return name_crop;
    }

    public String getTot_volume() {
        return tot_volume;
    }

    public String getMin_volume() {
        return min_volume;
    }

    public String getMin_price() {
        return min_price;
    }

    public String getDate() {
        return date;
    }
}
