package fh.burgenland.moveme.inquiry.domain;

import fh.burgenland.moveme.inquiry.api.InquiryContact;
import fh.burgenland.moveme.inquiry.api.InquiryForLocalMove;
import fh.burgenland.moveme.inquiry.api.InquiryLocation;
import fh.burgenland.moveme.inquiry.persistence.InquiryForLocalMoveRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
class InquiryForLocalMoveServiceTest {

    @Mock
    private InquiryForLocalMoveRepository repository;

    @Test
    void should_inquire_the_movement_successfully() {
        var inquiryDomain = new InquiryForLocalMoveDomain();
        inquiryDomain.setName("Alexi Paoli");
        inquiryDomain.setTelephoneNumber("4369999999");
        inquiryDomain.setFromStreet("Winarskystr. 14/20/1");
        inquiryDomain.setFromZip("1200");
        inquiryDomain.setToStreet("Innstraße 7/1");
        inquiryDomain.setToZip("1201");
        inquiryDomain.setCity("Wien");

        Mockito.when(repository.save(inquiryDomain)).thenReturn(inquiryDomain);
        var service = new InquiryForLocalMoveService(repository);
        var inquiry = InquiryForLocalMove.builder()
                .inquiryContact(InquiryContact.builder().name("Alexi Paoli").telephoneNumber("4369999999").build())
                .fromInquiryLocation(InquiryLocation.builder().street("Winarskystr. 14/20/1").zip("1200").city("Wien").build())
                .toInquiryLocation(InquiryLocation.builder().street("Innstraße 7/1").zip("1201").city("Wien").build())
                .build();
        var domainResult = service.inquiry(inquiry);

        Mockito.verify(this.repository, times(1)).save(inquiryDomain);

        assertThat(domainResult.getSuccess()).isNotNull();
    }
}