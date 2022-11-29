/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


/**
 *
 * @author otoledo
 */
public class SalesOrder {
    private String sOrderDate;
    private String sRegion;
    private String sRepresentative;
    private String sPhone;
    private String sItemName;
    private int nUnit;
    private double dUnitCost;
    private static int nNumberOfOrders;

    public SalesOrder() {
        nNumberOfOrders++;
    }

    public SalesOrder(String sOrderDate, String sRegion, String sRepresentative, String sPhone, String sItemName, int nUnit, double dUnitCost) {
        this.sOrderDate = sOrderDate;
        this.sRegion = sRegion;
        this.sRepresentative = sRepresentative;
        this.sItemName = sItemName;
        this.nUnit = nUnit;
        this.dUnitCost = dUnitCost;
        nNumberOfOrders++;
    }

    public String getPhone() {
        return sPhone;
    }

    public void setPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    public static int getNumberOfOrders(){
        return nNumberOfOrders;
    }

    public String getOrderDate() {
        return sOrderDate;
    }

    public String getRegion() {
        return sRegion;
    }

    public String getRepresentative() {
        return sRepresentative;
    }

    public String getItemName() {
        return sItemName;
    }

    public int getUnit() {
        return nUnit;
    }

    public double getUnitCost() {
        return dUnitCost;
    }

    public void setOrderDate(String sOrderDate) {
        this.sOrderDate = sOrderDate;
    }

    public void setRegion(String sRegion) {
        this.sRegion = sRegion;
    }

    public void setRepresentative(String sRepresentative) {
        this.sRepresentative = sRepresentative;
    }

    public void setItemName(String sItemName) {
        this.sItemName = sItemName;
    }

    public void setUnit(int nUnit) {
        this.nUnit = nUnit;
    }

    public void setUnitCost(double dUnitCost) {
        this.dUnitCost = dUnitCost;
    }

    public double totalCost(){
        double dTotal = 0;
        dTotal = nUnit * dUnitCost;
        return dTotal;
    }


}
