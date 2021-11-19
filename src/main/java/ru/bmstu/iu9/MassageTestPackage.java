package ru.bmstu.iu9;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class MassageTestPackage {
    private final String ID_PACKAGE_STRING = "packageId";
    
    @JsonProperty(ID_PACKAGE_STRING)
    private Integer packageId;

    @JsonProperty(TEST_STRING)
    private ArrayList<Test> test;
}
