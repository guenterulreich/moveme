package fh.burgenland.moveme.inquiry.domain;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class InquiryForLocalMoveDomain {
    String name;
    String telephoneNumber;
    String toStreet;
    String toZip;
    String fromStreet;
    String fromZip;
    String city;
}
