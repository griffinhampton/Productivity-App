package org.examples.NoteTaker.enums.users;


public enum UserPicker {
    CSE_220("CSE_220"),
    CSE_235("CSE_235");

    private final String className;

    UserPicker(String className){
        this.className = className;
    }
    public String getUser(){
        return className;
    }

}
