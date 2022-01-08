package fh.burgenland.moveme.data;

import fh.burgenland.moveme.inquiry.domain.InquiryForLocalMoveDomain;

public class InquiryForLocalMoveDomainTestData {

    public static InquiryForLocalMoveDomain getInquiryDomainForAlexiPaoli() {
        var inquiryDomain = new InquiryForLocalMoveDomain();
        inquiryDomain.setName("Alexi Paoli");
        inquiryDomain.setTelephoneNumber("4369999999");
        inquiryDomain.setFromStreet("Winarskystr. 14/20/1");
        inquiryDomain.setFromZip("1200");
        inquiryDomain.setToStreet("Innstraße 7/1");
        inquiryDomain.setToZip("1201");
        inquiryDomain.setCity("Wien");
        inquiryDomain.setReferenceNumber("IFLM_ALEXI_PAOLI_WIEN");

        return inquiryDomain;
    }
}
