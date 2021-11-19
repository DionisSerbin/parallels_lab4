package ru.bmstu.iu9;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class MassageTestPackage {
    private final String ID_PACKAGE_STRING = "packageId";
    private final String JS_SCRIPT_STRING = "jsScript";
    private final String FUNCTION_NAME_STRING = "functionName";
    private final String TESTS_STRING = "tests";

    @JsonProperty(ID_PACKAGE_STRING)
    private Integer packageId;

    
}
