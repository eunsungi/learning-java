package com.eunsungi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
//import java.sql.Date;

public class PackageImport {
    public static void main(String[] args) {
        Date date = new Date(); // equals java.util.Date date = new java.util.Date();
        java.sql.Date date1 = new java.sql.Date(1);

        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        String s = new String(); // java.lang no import keyword

    }
}
