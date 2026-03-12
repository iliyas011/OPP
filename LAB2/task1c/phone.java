package LAB2.task1c;

import java.util.Objects;

public class phone extends  Device {
    private  String OSestem ;

    public phone( String brand ,String model, int year , String OSestem ) {
        super(brand , model , year);
        this.OSestem = OSestem;
    }

    public  String getOSestem(){
        return OSestem;
    }
    public  void  setOSestem(){
        this.OSestem = OSestem;
    }
    @Override
    public  boolean equals(Object o){
        if(this == o) return  true ;
        if(o == null || getClass() != o.getClass() ) return  false ;
        if(!super.equals(o)) return  false ;
        phone Phone = (phone) o ;
        return  Objects.equals(OSestem , Phone.OSestem);
    }

    @Override
    public  int hashCode(){
        return  Objects.hash(super.hashCode() , OSestem);

    }
    @Override
    public  String toString(){
        return  super.toString() + String.format(" [OS: %s]" , OSestem);
    }


}
