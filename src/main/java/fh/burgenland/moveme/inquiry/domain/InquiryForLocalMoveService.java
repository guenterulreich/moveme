package fh.burgenland.moveme.inquiry.domain;

import fh.burgenland.moveme.infrastructure.domain.DomainResult;
import fh.burgenland.moveme.inquiry.api.InquiryContactAnswer;
import fh.burgenland.moveme.inquiry.api.InquiryForLocalMove;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InquiryForLocalMoveService {

    private final InquiryForLocalMoveRepository repository;

    @Autowired()
    public InquiryForLocalMoveService(InquiryForLocalMoveRepository repository) {
        this.repository = repository;
    }

    public DomainResult<InquiryContactAnswer> inquiry(InquiryForLocalMove inquiry) {
        this.repository.save(toDomain(inquiry));
        return DomainResult.<InquiryContactAnswer>builder().success(InquiryContactAnswer.builder().referenceNumber("dddd").answerHour(24).build()).build();
    }

    private InquiryForLocalMoveDomain toDomain(InquiryForLocalMove inquiry) {
        return InquiryForLocalMoveDomain
                .builder()
                .name(inquiry.getInquiryContact().getName())
                .telephoneNumber(inquiry.getInquiryContact().getTelephoneNumber())
                .toStreet(inquiry.getToInquiryLocation().getStreet())
                .toZip(inquiry.getToInquiryLocation().getZip())
                .fromStreet(inquiry.getFromInquiryLocation().getStreet())
                .fromZip(inquiry.getFromInquiryLocation().getZip())
                .city(inquiry.getFromInquiryLocation().getCity())
                .build();
    }
}
