package fh.burgenland.moveme.it.inquiry;

import io.cucumber.java.ParameterType;

public class ContactInformationParameterType {
    @ParameterType(".*")
    public TestContactNumber contactNumber(String contactNumber) {
        return TestContactNumber.builder().telephoneNumber(contactNumber).build();
    }
}
