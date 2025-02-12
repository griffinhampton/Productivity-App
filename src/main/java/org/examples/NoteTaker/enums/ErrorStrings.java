package org.examples.NoteTaker.enums;

public enum ErrorStrings {
    DATE_BLANK("Date cannot be blank."),
    TITLE_BLANK("Title cannot be blank."),
    CONTENT_BLANK("Content cannot be blank."),
    TITLE_TOO_LONG("Title cannot be more than 100 characters."),
    CONTENT_TOO_LONG("Content cannot be more than 10000 characters."),
    DATE_INVALID("Date is invalid."),
    DESCRIPTION_BLANK("Description cannot be blank."),
    DESCRIPTION_TOO_LONG("Description cannot be more than 10000 characters."),
    CATEGORY_BLANK("Category cannot be blank."),
    CATEGORY_TOO_LONG("Category cannot be more than 100 characters."),
    PRIORITY_BLANK("Priority cannot be blank."),
    PRIORITY_INVALID("Priority is invalid."),
    TAG_BLANK("Tag cannot be blank."),
    TAG_TOO_LONG("Tag cannot be more than 100 characters."),
    NOTE_BLANK("Note cannot be blank."),
    STRANGE_ERROR("Something went wrong."),
    NOTE_NOT_FOUND("Note not found."),
    NOTE_ALREADY_EXISTS("Note already exists."),
    ;

    private final String errorStrings;

    ErrorStrings(String errorStrings) {
        this.errorStrings = errorStrings;
    }
    public String getErrorStrings() {
        return errorStrings;
    }
    public String toString() {
        return "Error: "+ this.errorStrings;
    }
}
