package org.ziemer.test.triangle;

public class Triangle {


    public static State determine(long sideA, long sideB, long sideC) {


        if (!isTriangle(sideA, sideB, sideC)) {
            return State.NOT_A_TRIANGLE;
        }

        if (isEquiliteral(sideA, sideB, sideC)) {
            return State.EQUILITERAL;
        }

        if (isIsosceles(sideA, sideB, sideC)) {
            return State.ISOSCELES;
        }

        return State.SCALENE;
    }

    private static boolean isTriangle(long sideA, long sideB, long sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            return false;
        }

        return sideA + sideB > sideC && sideA + sideC > sideB && sideC + sideB > sideA;
    }

    private static boolean isEquiliteral(long sideA, long sideB, long sideC) {
        return sideA == sideB && sideB == sideC;
    }

    private static boolean isIsosceles(long sideA, long sideB, long sideC) {
        return sideA == sideB || sideB == sideC || sideA == sideC;
    }

    public enum State {
        ISOSCELES,
        EQUILITERAL,
        SCALENE,
        NOT_A_TRIANGLE
    }
}
