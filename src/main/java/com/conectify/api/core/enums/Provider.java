package com.conectify.api.core.enums;

public enum Provider {

    FIREBASE("firebase"),
    MICROSOFT("microsoft"),
    GOOGLE("google");

    private final String name;

    Provider(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Provider fromName(String name) {
        for (Provider provider : values()) {
            if (provider.getName().equalsIgnoreCase(name)) {
                return provider;
            }
        }
        return null;
    }
}
