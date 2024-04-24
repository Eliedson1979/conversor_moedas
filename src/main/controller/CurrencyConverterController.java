package controller;

import service.CurrencyConverterService;

/**
 * Controller class responsible for managing the Currency Converter Application.
 */
public class CurrencyConverterController {

    /**
     * Initiates the currency converter application.
     */
    public static void start() {
        // Start the currency converter service
        CurrencyConverterService.startCurrencyConverter();
    }

}
