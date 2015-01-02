package com.tracebucket.x1.addressbook.dictionary;



public enum Status {
    ACTIVE("Active","ACTIVE"),
    INACTIVE("Inactive","INACTIVE");

    private final String status;
    private final String abbreviation;

    Status(String status, String abbreviation){
        this.status = status;
        this.abbreviation = abbreviation;
    }

    public String getStatus(){
        return status;
    }

    public String getAbbreviation(){
        return abbreviation;
    }
}
