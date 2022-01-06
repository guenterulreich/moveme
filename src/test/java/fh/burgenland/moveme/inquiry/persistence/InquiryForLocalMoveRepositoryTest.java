package fh.burgenland.moveme.inquiry.persistence;

import fh.burgenland.moveme.inquiry.domain.InquiryForLocalMoveDomain;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class InquiryForLocalMoveRepositoryTest {

    @Autowired
    InquiryForLocalMoveRepository repository;

    @Test
    public void canSaveAnInquiryForLocalMove() {
        var inquiryDomain = new InquiryForLocalMoveDomain();
        inquiryDomain.setName("Alexi Paoli");
        inquiryDomain.setTelephoneNumber("4369999999");
        inquiryDomain.setFromStreet("Winarskystr. 14/20/1");
        inquiryDomain.setFromZip("1200");
        inquiryDomain.setToStreet("Innstraße 7/1");
        inquiryDomain.setToZip("1201");
        inquiryDomain.setCity("Wien");

        var result = repository.save(inquiryDomain);
        assertThat(result).isEqualTo(inquiryDomain);
    }
}
