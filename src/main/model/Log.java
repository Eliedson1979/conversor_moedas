package model;

import java.time.LocalDateTime;

/**
 * Represents a log entry for currency conversion.
 */
public class Log {
    private static int nextId = 1;
    private int id;
    private LocalDateTime date;
    private String originalValue;
    private String baseSymbol;
    private String baseCurrency;
    private String targetSymbol;
    private String targetCurrency;
    private String formattedResult;

    /**
     * Constructs a Log object with the specified parameters.
     *
     * @param currentDateTime   The date and time of the log entry.
     * @param originalValue     The original value before conversion.
     * @param baseSymbol        The symbol of the base currency.
     * @param targetSymbol      The symbol of the target currency.
     * @param baseCurrency     The name of the base currency.
     * @param targetCurrency    The name of the target currency.
     * @param formattedResult   The formatted result after conversion.
     */
    public Log(LocalDateTime currentDateTime, String originalValue, String baseSymbol, String targetSymbol,
        String baseCurrency, String targetCurrency, String formattedResult) {
        this.id = nextId++;
        this.date = currentDateTime;
        this.originalValue = originalValue;
        this.baseSymbol = baseSymbol;
        this.baseCurrency = baseCurrency;
        this.targetSymbol = targetSymbol;
        this.targetCurrency = targetCurrency;
        this.formattedResult = formattedResult;
    }

    // Getters
    public int getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getOriginalValue() {
        return originalValue;
    }

    public String getBaseSymbol() {
        return baseSymbol;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public String getTargetSymbol() {
        return targetSymbol;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public String getFormattedResult() {
        return formattedResult;
    }

    /**
     * Prints the log entry to the console.
     */
    public void printLog() {
        System.out.println("################################");
        System.out.println("Log ID: " + this.getId());
        System.out.println("Date: " + this.getDate().toLocalDate());
        System.out.println("Time: " + this.getDate().toLocalTime());
        System.out.println("Conversion info:");
        System.out.println("Input value: " + this.getOriginalValue() + " " + this.getBaseSymbol() + " " + this.getBaseCurrency());
        System.out.println("Output value: " + this.getFormattedResult() + " " + this.getTargetSymbol() + " " + this.getTargetCurrency());
        System.out.println("################################");
    }
}
