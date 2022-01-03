package fh.burgenland.moveme.inquiry.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InquiryController {

    @PostMapping("inquireForLocalMove")
    public ResponseEntity<InquiryContactAnswer> inquireForLocalMove(@RequestBody InquiryForLocalMove inquiry) {
        return ResponseEntity.internalServerError().build();
    }

}
