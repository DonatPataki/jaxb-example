package legoset;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.Year;

public class DateAdapter extends XmlAdapter<String, Year> {
    @Override
    public String marshal (Year year) {
        return year.toString();
    }
    @Override
    public Year unmarshal(String string) {
        return Year.parse(string);
    }
}