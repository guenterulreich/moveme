package fh.burgenland.moveme;

import io.cucumber.spring.ScenarioScope;
import org.springframework.stereotype.Component;
import org.springframework.test.web.reactive.server.WebTestClient;

@Component
@ScenarioScope
public class WebResponseContext {
    WebTestClient.ResponseSpec lastResponse;
}
