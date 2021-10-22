package ru.itsjava.statics_3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Figure {
    private final double PI = 3.14159265;

    abstract void getCircleName();

    public double getCircleLength() {
        return 0;
    }

    public String toString() {
        return null;
    }
}
