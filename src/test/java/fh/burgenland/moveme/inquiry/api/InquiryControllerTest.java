package fh.burgenland.moveme.inquiry.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import fh.burgenland.moveme.infrastructure.domain.DomainResult;
import fh.burgenland.moveme.inquiry.domain.InquiryForLocalMoveService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.times;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@WebMvcTest(value = InquiryController.class)
public class InquiryControllerTest {

    @Autowired
    protected MockMvc mvc;

    @MockBean
    InquiryForLocalMoveService service;

    @Test
    public void should_return_http_201_for_successfully_creation_of_inquiry_for_local_move() throws Exception {
        var inquiry = InquiryForLocalMove.builder()
                .inquiryContact(InquiryContact.builder().name("Alexi Paoli").telephoneNumber("4369999999").build())
                .fromInquiryLocation(InquiryLocation.builder().street("Winarskystr. 14/20/1").zip("1200").city("Wien").build())
                .toInquiryLocation(InquiryLocation.builder().street("Innstraße 7/1").zip("1201").city("Wien").build())
                .build();
        var successAnswer = InquiryContactAnswer.builder().referenceNumber("dkdkdkd").answerHour(24).build();
        var domainResult = DomainResult.<InquiryContactAnswer>builder().success(successAnswer).build();

        Mockito.when(service.inquiry(inquiry)).thenReturn(domainResult);

        this.mvc.perform(
                post("/inquireForLocalMove")
                        .content(toJson(inquiry))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)
        ).andExpect(status().isCreated());

        Mockito.verify(this.service, times(1)).inquiry(inquiry);
    }

    public String toJson(InquiryForLocalMove inquiry) throws JsonProcessingException {
        var objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(inquiry);
    }
}
