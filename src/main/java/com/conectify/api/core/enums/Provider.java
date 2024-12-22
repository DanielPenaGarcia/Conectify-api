package com.conectify.api.core.enums;

public enum Provider {
    FIREBASE("firebase"),
    GOOGLE("google"),
    MICROSOFT("microsoft");

    private final String value;

    Provider(String name) {
        this.value = name;
    }

    public String getValue() {
        return value;
    }
}
