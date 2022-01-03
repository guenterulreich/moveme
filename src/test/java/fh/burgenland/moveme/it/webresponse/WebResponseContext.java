package fh.burgenland.moveme.it.webresponse;

import io.cucumber.spring.ScenarioScope;
import org.springframework.stereotype.Component;
import org.springframework.test.web.reactive.server.WebTestClient;

@Component
@ScenarioScope
public class WebResponseContext {
    public WebTestClient.ResponseSpec lastResponse;
}
