package com.company;

public class Cast {

    private String fullName;
    private String role;

    public String getFullName() {
        return fullName;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Cast: \n" +
                "fullName: " + fullName + '\n' +
                "role='" + role + "\n";
    }
}
