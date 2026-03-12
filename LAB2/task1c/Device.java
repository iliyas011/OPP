package LAB2.task1c;

import java.lang.classfile.Signature;
import java.util.Objects;

public class Device {
    private  String brand;
    private  int year ;
    private  String model;

    public Device(String brand , String model , int year) {
        this.brand = brand;
        this.model = model;
        this.year = year ;
    }

    public  String getBrand(){
        return  brand;
    }
    public  void  setBrand(String brand){
        this.brand = brand ;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public  boolean equals(Object o){
        if(this == o) return  true;
        if(o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
                return year == device.year && Objects.equals(brand ,device.brand) && Objects.equals(model , device.model);
    }

    @Override
    public int hashCode(){
        return  Objects.hash(brand , model ,year);
    }
    @Override
    public  String toString(){
        return String.format( "%s %s (%d)" ,brand , model , year);
    }


}



