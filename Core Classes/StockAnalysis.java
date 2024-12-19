package stockdata;

import java.util.Iterator;

public class StockAnalysis {
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
        Iterator<Stock> iterator = stockList.iterator();
        while (iterator.hasNext()) {
            Stock stock = iterator.next();
            if (stock.getVolume() > maxVolume) {
                maxVolume = stock.getVolume();
                highestVolumeStock = stock;
            }
        }
        return highestVolumeStock;
    }
}
