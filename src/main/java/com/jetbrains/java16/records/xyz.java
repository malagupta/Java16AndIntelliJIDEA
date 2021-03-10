package com.jetbrains.java16.records;
import com.fasterxml.jackson.annotation.JsonProperty;

// Backup file so that I don;t delete the property annotations by mistake
// These annotations are NOT required for Jackson 2.12.2 and beyond
record xyz (
        @JsonProperty("width") double width,
        @JsonProperty("height") double height) {
}
