package fh.burgenland.moveme.inquiry.domain;

import fh.burgenland.moveme.infrastructure.domain.DomainResult;
import fh.burgenland.moveme.inquiry.api.InquiryContactAnswer;
import fh.burgenland.moveme.inquiry.api.InquiryForLocalMove;
import org.springframework.stereotype.Component;

@Component
public class InquiryForLocalMoveService {

    public DomainResult<InquiryContactAnswer> inquiry(InquiryForLocalMove inquiry) {
        return null;
    }
}
