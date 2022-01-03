package fh.burgenland.moveme.it.inquiry;

import io.cucumber.java.ParameterType;

public class LocationParameterType {
    @ParameterType("(.*), (.*) (.*)")
    public TestLocation location(String street, String zip, String city) {
        return TestLocation.builder().street(street).zip(zip).city(city).build();
    }
}
