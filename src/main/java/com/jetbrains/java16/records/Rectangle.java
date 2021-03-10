package com.jetbrains.java16.records;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Rectangle(
        @JsonProperty("width") int width,
        @JsonProperty("length") int length) {
}
