package org.examples.NoteTaker.enums.users.userClasses;

import org.examples.NoteTaker.enums.users.UserPicker;

public enum CSE_235 implements IuserClasses {
    USER_1("Griffin"),
    USER_GUEST("Guest");
    private final String userName;

    CSE_235(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
    public UserPicker getUserClass() {
        return UserPicker.CSE_235;
    }

}
