package com.company;

public enum PositionTitle
{
    ADMINISTRATION("Administration"), PRODUCTION("Production"), SALES("Sales"), MAINTENANCE("Maintenance"), TECHNICAL("Technical"), SECERTARIAL("Secretarial");

    private String nameReplace;

    PositionTitle(String nameReplace)
    {
        this.nameReplace = nameReplace;
    }

    @Override
    public String toString() {
        return nameReplace;
    }
}
