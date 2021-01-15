package Plane3.Bean;

import java.util.Set;

public class Order{
    private String id;
    private String jpjg;//机票价格
    private float ryf;//燃油费
    private float hkzhx;//航空综合险
    private float jptgx;//机票退改险
    private float yhj;//优惠券
    private float hszj; //含税总价
    private float airportTax;//
    private Set<Passenger> passengerSet;//集合
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJpjg() {
        return jpjg;
    }

    public void setJpjg(String jpjg) {
        this.jpjg = jpjg;
    }

    public float getRyf() {
        return ryf;
    }

    public void setRyf(float ryf) {
        this.ryf = ryf;
    }

    public float getHkzhx() {
        return hkzhx;
    }

    public void setHkzhx(float hkzhx) {
        this.hkzhx = hkzhx;
    }

    public float getJptgx() {
        return jptgx;
    }

    public void setJptgx(float jptgx) {
        this.jptgx = jptgx;
    }

    public float getYhj() {
        return yhj;
    }

    public void setYhj(float yhj) {
        this.yhj = yhj;
    }

    public float getHszj() {
        return hszj;
    }

    public void setHszj(float hszj) {
        this.hszj = hszj;
    }

    public float getAirportTax() {
        return airportTax;
    }

    public void setAirportTax(float airportTax) {
        this.airportTax = airportTax;
    }
}
