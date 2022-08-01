package com.sparta.jn;

public class FilmClassifications {

    public static String availableClassifications(int ageOfViewer) {
        String result;
        if (ageOfViewer < 12) {
            result = "U, PG films are available.";
        } else if (ageOfViewer >= 12 && ageOfViewer <15) {
            result = "U, PG, 12 & 12A films are available.";
        } else if (ageOfViewer >= 15 && ageOfViewer <18) {
            result = "U, PG, 12, 12A & 15 films are available.";
        } else {
            result = "All films are available.";
        }
        return result;
    }

}
