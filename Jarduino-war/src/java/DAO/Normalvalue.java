package DAO;
// Generated 02-dic-2015 22:22:59 by Hibernate Tools 4.3.1



/**
 * Normalvalue generated by hbm2java
 */
public class Normalvalue  implements java.io.Serializable {


     private int idsensor;
     private int value;

    public Normalvalue() {
    }

    public Normalvalue(int idsensor, int value) {
       this.idsensor = idsensor;
       this.value = value;
    }
   
    public int getIdsensor() {
        return this.idsensor;
    }
    
    public void setIdsensor(int idsensor) {
        this.idsensor = idsensor;
    }
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }




}


