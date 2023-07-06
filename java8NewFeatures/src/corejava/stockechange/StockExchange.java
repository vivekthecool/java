package corejava.stockechange;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class StockExchange {
    private static Map<String, List<String>> transactions = new HashMap<>();
    private static String splitBy = ",";
    private static void readStocksFromFile() {
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("StockExchange.csv"));
            boolean isHeader = true;
            while ((line = br.readLine()) != null) {
                if(isHeader) {
                    isHeader = false;
                } else {
                    String[] stockDetails = line.split(splitBy);
                    List<String> values = new ArrayList<>();
                    if(transactions.containsKey(stockDetails[1])) {
                        transactions.get(stockDetails[1]).add(line);
                        transactions.put(stockDetails[1], transactions.get(stockDetails[1]));
                    } else {
                        values.add(line);
                        transactions.put(stockDetails[1], values);
                    }
                }
//                "Timestamp [" + stockDetails[0] + "] " +
//                "Symbol [" + stockDetails[1] + "] " +
//                "Price [" + stockDetails[2] + "] " +
//                "Qty [" + stockDetails[3] + "] " +
//                "Account [" + stockDetails[4] + "]"
//                "buy/sell [" + stockDetails[5] + "]"
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int numberOfTransaction(String symbol) {
        if(!transactions.containsKey(symbol)) {
            return 0;
        }
        List<String> symbolsDetails = transactions.get(symbol);

        return symbolsDetails.stream()
                .filter(line -> line.split(splitBy)[5].equalsIgnoreCase("Buy"))
                .collect(Collectors.toList()).size();
    }

    public static void main(String[] args) throws FileNotFoundException {
        readStocksFromFile();
//        System.out.println("EY Transactions: " + numberOfTransaction("EY"));
        System.out.println(transactions);
    }
}
