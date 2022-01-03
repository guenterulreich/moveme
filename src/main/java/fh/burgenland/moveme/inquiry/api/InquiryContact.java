package fh.burgenland.moveme.inquiry.api;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InquiryContact {
    private final String name;
    private final String telephoneNumber;
}
