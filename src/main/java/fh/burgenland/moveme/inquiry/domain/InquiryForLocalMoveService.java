package fh.burgenland.moveme.inquiry.domain;

import fh.burgenland.moveme.infrastructure.domain.DomainResult;
import fh.burgenland.moveme.inquiry.api.InquiryContactAnswer;
import fh.burgenland.moveme.inquiry.api.InquiryForLocalMove;
import fh.burgenland.moveme.inquiry.persistence.InquiryForLocalMoveRepository;
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
        var domain = new InquiryForLocalMoveDomain();
        domain.setName(inquiry.getInquiryContact().getName());
        domain.setTelephoneNumber(inquiry.getInquiryContact().getTelephoneNumber());
        domain.setToStreet(inquiry.getToInquiryLocation().getStreet());
        domain.setToZip(inquiry.getToInquiryLocation().getZip());
        domain.setFromStreet(inquiry.getFromInquiryLocation().getStreet());
        domain.setFromZip(inquiry.getFromInquiryLocation().getZip());
        domain.setCity(inquiry.getFromInquiryLocation().getCity());
        return domain;
    }
}
