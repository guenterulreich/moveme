package fh.burgenland.moveme.inquiry.domain;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.util.Locale;

@Value
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class ReferenceNumber {
    String value;

    public static ReferenceNumber localReferenceNumberOf(String name, String city) {
        System.out.println(name);
        return new ReferenceNumber("IFLM_" + name.toUpperCase(Locale.ROOT).replace(" ", "_") + "_" + city.toUpperCase(Locale.ROOT));
    }
}
