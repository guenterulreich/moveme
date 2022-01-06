package fh.burgenland.moveme.data;

import fh.burgenland.moveme.inquiry.api.InquiryContactAnswer;

public class InquiryContactAnswerTestData {
    public static InquiryContactAnswer getAnswerForAlexiPaoli() {
        return InquiryContactAnswer.builder().referenceNumber("IFLM_ALEX_PAOLI_WIEN").answerHour(24).build();
    }
}
