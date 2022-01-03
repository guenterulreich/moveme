package fh.burgenland.moveme.inquiry.api;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InquiryLocation {
    private final String street;
    private final String zip;
    private final String city;
}
