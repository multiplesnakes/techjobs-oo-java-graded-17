package org.launchcode.techjobs.oo;

import java.util.Objects;

// Modify to extend the JobField class
public class CoreCompetency extends JobField {

//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public CoreCompetency() {
//        this.id = nextId;
//        nextId++;
//    }

//    public CoreCompetency(String value) {
//        this();
//        this.value = value;
//    }

    // Replace the original constructors using super and passing in the (value)
    public CoreCompetency(String value) {
        super(value);
    }

    // Add the getValue method
    public String getValue() {
        return value;
    }

    // Add the setValue method
    public void setValue(String value) {
        this.value = value;
    }
}

/*
    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency that = (CoreCompetency) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
    //  ONLY a getter for the 'id' field.

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }
}
*/