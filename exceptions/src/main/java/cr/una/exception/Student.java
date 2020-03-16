package cr.una.exception;

import java.util.List;

public class Student {
    String fullName;
    int credits;

    public Student() {
    }

    public Student(String fullName) {
        this.fullName = fullName;
        credits = 0;
        String[] nameParts = fullName.split(" ");
        final int maximumNumberOfNameParts = 3;
        if (nameParts.length > maximumNumberOfNameParts) throw new StudentNameFormatException();
    }
}
