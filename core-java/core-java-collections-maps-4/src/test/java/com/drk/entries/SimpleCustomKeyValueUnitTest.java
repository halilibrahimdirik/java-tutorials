package com.drk.entries;

import com.google.common.collect.ImmutableMap;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;

class SimpleCustomKeyValueUnitTest {


    @Test
    public void givenModifiableEntries_whenVerifying_thenShouldContainKeyValues() {
        Map.Entry<String, String> firstEntry = new SimpleCustomKeyValue<>("key1", "value1");

        Map.Entry<String, String> secondEntry = new SimpleCustomKeyValue<>("key2", "value2");
        secondEntry.setValue("different value");



    }

}