package fh.burgenland.moveme.data;

import fh.burgenland.moveme.inquiry.api.InquiryContact;
import fh.burgenland.moveme.inquiry.api.InquiryForLocalMove;
import fh.burgenland.moveme.inquiry.api.InquiryLocation;

public class InquiryForLocalMoveTestData {

    public static InquiryForLocalMove getInquiryForAlexiPaoli() {
        return InquiryForLocalMove.builder()
                .inquiryContact(InquiryContact.builder().name("Alexi Paoli").telephoneNumber("4369999999").build())
                .fromInquiryLocation(InquiryLocation.builder().street("Winarskystr. 14/20/1").zip("1200").city("Wien").build())
                .toInquiryLocation(InquiryLocation.builder().street("Innstraße 7/1").zip("1201").city("Wien").build())
                .build();
    }
}
