package e_19_06_display_currency_names;

import java.util.Currency;
import java.util.Set;
import java.util.stream.Stream;

/**
 * The static getAvailableCurrencies method of the {@code java.util.Currency}
 * class yields a set of {@code Currency} objects. Turn it into a stream and
 * transform it into a stream of the currency display names. Print them in
 * sorted order.
 */
public class CurrencyNames
{
    public static void main(String[] args)
    {
        Set<Currency> currencies = Currency.getAvailableCurrencies();

        try (Stream<Currency> currencyStream = currencies.stream()) {
            currencyStream
                    .map(Currency::getDisplayName)
                    .sorted()
                    .forEach(System.out::println);
        }
    }
}
