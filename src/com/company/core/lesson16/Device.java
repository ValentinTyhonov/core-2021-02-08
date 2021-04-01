package com.company.core.lesson16;

import com.company.core.lesson11.DeviceInterface;
import com.company.core.lesson11.Item;

public class Device extends Item implements DeviceInterface
{

    private String name;
    @Useless(name = "id", value = "no need to use it")
    protected int id;
    double price;
    @Useless("no need to use it")
    public int count;

    public Device(String name, int id, double price, int count) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.count = count;
    }

    public Device(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Device() {
    }

    public Device(String name) {
        this.name = name;
    }

    @Useless(name = "showDeviceNameWithParam", value = "no need to use it")
    private void showDeviceNameWithParam(String param){
        System.out.println(name + " : " + param);
    }

    protected double getTotalPrice(){
        return price * count;
    }

    void convertName(){
        String name = this.getName();
        this.setName(String.valueOf(name.charAt(0)).toUpperCase());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
