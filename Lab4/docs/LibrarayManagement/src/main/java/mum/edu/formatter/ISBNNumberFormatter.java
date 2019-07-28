package mum.edu.formatter;

import mum.edu.domain.ISBNNumber;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class ISBNNumberFormatter implements Formatter<ISBNNumber> {

    @Override
    public ISBNNumber parse(String s, Locale locale) throws ParseException {
        String[] strings = s.split("-");
        return new ISBNNumber(Integer.valueOf(strings[0]), Integer.valueOf(strings[1]), Integer.valueOf(strings[2]));
    }

    @Override
    public String print(ISBNNumber isbnNumber, Locale locale) {
        return isbnNumber.getStart() + "#" +isbnNumber.getMiddle() + "$"+isbnNumber.getEnd();
    }
}
