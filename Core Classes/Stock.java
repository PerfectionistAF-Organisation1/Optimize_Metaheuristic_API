package stockdata;

import java.util.*;

class Stock {
    private String ticker;
    private String companyName;
    private String sector;
    private String industry;
    private double currentPrice;
    private double openingPrice;
    private double closingPrice;
    private double highestPrice;
    private double lowestPrice;
    private long volume;
    private Date date;

    // Constructor
    public Stock(String ticker, String companyName, String sector, String industry, double currentPrice, Date date) {
        this.ticker = ticker;
        this.companyName = companyName;
        this.sector = sector;
        this.industry = industry;
        this.currentPrice = currentPrice;
        this.date = date;
    }

    // Getters and Setters
    public String getTicker() {
        return ticker;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getSector() {
        return sector;
    }

    public String getIndustry() {
        return industry;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getOpeningPrice() {
        return openingPrice;
    }

    public void setOpeningPrice(double openingPrice) {
        this.openingPrice = openingPrice;
    }

    public double getClosingPrice() {
        return closingPrice;
    }

    public void setClosingPrice(double closingPrice) {
        this.closingPrice = closingPrice;
    }

    public double getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(double highestPrice) {
        this.highestPrice = highestPrice;
    }

    public double getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(double lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}