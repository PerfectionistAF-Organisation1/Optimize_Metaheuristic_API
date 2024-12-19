package stockdata;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StockList {
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
