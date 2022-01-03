package fh.burgenland.moveme.it.inquiry;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class TestLocation {
    String street;
    String zip;
    String city;
}
