package ru.bmstu.iu9;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class MessageStor {
    private final String ID_PACKAGE_STRING = "packageId";
    private final String TEST_STRING = "test";

    @JsonProperty(ID_PACKAGE_STRING)
    private Integer packageId;

    @JsonProperty(TEST_STRING)
    private ArrayList<Test> test;

    @JsonCreator
    

}
