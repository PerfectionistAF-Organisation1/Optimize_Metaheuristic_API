package stockdata;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Stock stock1 = new Stock("AAPL", "Apple Inc.", "Technology", "Consumer Electronics", 175.12, new Date());
        stock1.setOpeningPrice(170.00);
        stock1.setClosingPrice(174.00);
        stock1.setHighestPrice(176.00);
        stock1.setLowestPrice(169.50);
        stock1.setVolume(1200000);

        Stock stock2 = new Stock("MSFT", "Microsoft Corp.", "Technology", "Software", 310.25, new Date());
        stock2.setOpeningPrice(305.00);
        stock2.setClosingPrice(312.00);
        stock2.setHighestPrice(315.00);
        stock2.setLowestPrice(303.50);
        stock2.setVolume(1500000);

        StockList stockList = new StockList();
        stockList.addStock(stock1);
        stockList.addStock(stock2);

        StockAnalysis analysis = new StockAnalysis(stockList);

        System.out.println("Number of Stocks: " + stockList.getNumberOfStocks());
        System.out.println("Average Price of AAPL: " + analysis.calculateAveragePrice("AAPL"));
        System.out.println("Price Change of MSFT: " + analysis.calculatePriceChange("MSFT"));

        Stock highestVolumeStock = analysis.getHighestVolumeStock();
        if (highestVolumeStock != null) {
            System.out.println("Stock with Highest Volume: " + highestVolumeStock.getTicker());
        }
    }
}
