package fh.burgenland.moveme.it.inquiry;

import fh.burgenland.moveme.inquiry.api.InquiryContactAnswer;
import io.cucumber.spring.ScenarioScope;
import org.springframework.stereotype.Component;

@Component
@ScenarioScope
public class InquiryContext {
    TestClient client;
    TestLocation fromLocation;
    TestLocation toLocation;
    TestContactNumber contactInformation;
    InquiryContactAnswer inquiryContactAnswer;
}
