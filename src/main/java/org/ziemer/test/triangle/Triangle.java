package org.ziemer.test.triangle;

public class Triangle {
    public static String determine(long sideA, long sideB, long sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            return "Not a triangle";
        }

        if (sideA + sideB < sideC || sideA + sideC < sideB || sideC + sideB < sideA) {
            return "Not a triangle";
        }

        if (sideA == sideB && sideB == sideC) {
            return "Equilateral";
        } else if (sideA == sideB || sideB == sideC || sideA == sideC) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}
