package org.ipfsbox.library.entity;

public class Stats_bw {

    /**
     * TotalIn : 778463996
     * TotalOut : 363485671
     * RateIn : 623590.5376857836
     * RateOut : 64921.958962250166
     */

    private int TotalIn;
    private int TotalOut;
    private double RateIn;
    private double RateOut;

    public int getTotalIn() {
        return TotalIn;
    }

    public void setTotalIn(int TotalIn) {
        this.TotalIn = TotalIn;
    }

    public int getTotalOut() {
        return TotalOut;
    }

    public void setTotalOut(int TotalOut) {
        this.TotalOut = TotalOut;
    }

    public double getRateIn() {
        return RateIn;
    }

    public void setRateIn(double RateIn) {
        this.RateIn = RateIn;
    }

    public double getRateOut() {
        return RateOut;
    }

    public void setRateOut(double RateOut) {
        this.RateOut = RateOut;
    }

    @Override
    public String toString() {
        return "bw{" +
                "TotalIn=" + TotalIn +
                ", TotalOut=" + TotalOut +
                ", RateIn=" + RateIn +
                ", RateOut=" + RateOut +
                '}';
    }
}
