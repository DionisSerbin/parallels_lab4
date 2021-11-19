package ru.bmstu.iu9;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Test {

    private final String TEST_NAME_STRING = "testName";
    private final String EXPECTED_RESULT_STRING = "expectedResult";
    private final String PARAMS_STRING = "params";
    private final String RESULT_STRING = "result";

    @JsonProperty(TEST_NAME_STRING)
    private String testName;

    @JsonProperty(EXPECTED_RESULT_STRING)
    private String expectedREsult;

    @JsonProperty(PARAMS_STRING)
    private ArrayList<Integer> params;

    @JsonProperty(RESULT_STRING)
    private boolean result;

    @JsonCreator
    public Test(@JsonProperty(EXPECTED_RESULT_STRING) String testName,
                @JsonProperty(EXPECTED_RESULT_STRING) String expectedREsult,
                @JsonProperty(PARAMS_STRING) ArrayList<Integer> params){

        this.testName = testName;
        this.expectedREsult = expectedREsult;
        this.params = params;
        this.result = false;

    }

    public Test(String testName, String expectedREsult,
                ArrayList<Integer> params, boolean result){

        this.testName = testName;
        this.expectedREsult = expectedREsult;
        this.params = params;
        this.result = result;

    }

    public String getExpectedREsult() {
        return expectedREsult;
    }
    
}
