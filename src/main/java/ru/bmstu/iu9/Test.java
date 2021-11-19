package ru.bmstu.iu9;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Test {

    private final String TEST_NAME_STRING = "testName";
    private final String EXPECTED_RESULT_STRING = "expectedResult";

    @JsonProperty(TEST_NAME_STRING)
    private String testName;

    @JsonProperty(EXPECTED_RESULT_STRING)
    private String expectedREsult;
    
}
