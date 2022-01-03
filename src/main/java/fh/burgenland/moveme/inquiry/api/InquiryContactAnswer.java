package fh.burgenland.moveme.inquiry.api;

import lombok.Data;

@Data
public class InquiryContactAnswer {
    private final String referenceNumber;
    private final int answerHour;
}
