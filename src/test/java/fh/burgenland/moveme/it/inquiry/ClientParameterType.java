package fh.burgenland.moveme.it.inquiry;

import io.cucumber.java.ParameterType;

public class ClientParameterType {
    @ParameterType(".*")
    public TestClient client(String name) {
        return TestClient.builder().name(name).build();
    }
}
