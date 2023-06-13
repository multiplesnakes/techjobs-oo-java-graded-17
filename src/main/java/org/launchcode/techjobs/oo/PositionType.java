package org.launchcode.techjobs.oo;

import java.util.Objects;

// Modify to extend the JobField class
public class PositionType extends JobField{

//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public PositionType() {
//        id = nextId;
//        nextId++;
//    }
//
//    public PositionType(String value) {
//        this();
//        this.value = value;
//    }

    // Replace the original constructors using super and passing in the (value)
    public PositionType(String value) {
        super(value);
    }
}
//    // TODO: Add a custom toString() method that returns the data stored in 'value'.
//    @Override
//    public String toString(){
//        return value;
//    }
//
//    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
//    //  their id fields match.
//    @Override
//    // It checks if o is null or if it belongs to a different class (getClass() != o.getClass()).
//    // If either of these conditions is true, it means o cannot be equal to this, and it returns false.
//    public boolean equals(Object o) {
//        if (this == o)
//            return true;
//        if (o == null || getClass() != o.getClass())
//            return false;
//        PositionType that = (PositionType) o;
//        return id == that.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, value);
//    }
//// Getters and Setters:
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
//
//}