package stockdata;

import java.util.*;

class StockList {
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public Stock getStockByTicker(String ticker) {
        for (Stock stock : stocks) {
            if (stock.getTicker().equals(ticker)) {
                return stock;
            }
        }
        return null;
    }

    public List<Stock> getStocksBySector(String sector) {
        List<Stock> result = new ArrayList<>();
        for (Stock stock : stocks) {
            if (stock.getSector().equalsIgnoreCase(sector)) {
                result.add(stock);
            }
        }
        return result;
    }

    public int getNumberOfStocks() {
        return stocks.size();
    }

    public Iterator<Stock> iterator() {
        return stocks.iterator();
    }
}

class StockAnalysis {
    private StockList stockList;

    // Constructor
    public StockAnalysis(StockList stockList) {
        this.stockList = stockList;
    }

    public double calculateAveragePrice(String ticker) {
        Stock stock = stockList.getStockByTicker(ticker);
        if (stock == null) {
            return 0.0;
        }
        return (stock.getOpeningPrice() + stock.getClosingPrice()) / 2;
    }

    public double calculatePriceChange(String ticker) {
        Stock stock = stockList.getStockByTicker(ticker);
        if (stock == null) {
            return 0.0;
        }
        return stock.getClosingPrice() - stock.getOpeningPrice();
    }

    public Stock getHighestVolumeStock() {
        Stock highestVolumeStock = null;
        long maxVolume = 0;
        for (Stock stock : stockList.iterator()) {
            if (stock.getVolume() > maxVolume) {
                maxVolume = stock.getVolume();
                highestVolumeStock = stock;
            }
        }
        return highestVolumeStock;
    }
}