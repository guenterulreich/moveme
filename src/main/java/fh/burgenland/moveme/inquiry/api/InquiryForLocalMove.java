package fh.burgenland.moveme.inquiry.api;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InquiryForLocalMove {
    private final InquiryContact inquiryContact;
    private final InquiryLocation fromInquiryLocation;
    private final InquiryLocation toInquiryLocation;
}
