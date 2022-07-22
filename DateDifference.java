package com.vishu;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateDifference {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.of(2022, 6, 1);

        LocalDate pastDate = LocalDate.of(2013, 2, 2);
        long Prncipal = 5000;

        long noDays = ChronoUnit.DAYS.between(pastDate, nowDate);
        System.out.println(noDays);
        double InterestAmount12 = Prncipal*(0.12*noDays)/365;  // D3*(0.12*C3)/365
        double InterestAmount18 = Prncipal*(0.18*noDays)/365;
        double InterestAmount24 = Prncipal*(0.24*noDays)/365;
        double InterestAmount36 = Prncipal*(0.36*noDays)/365;
        System.out.println("12  "+InterestAmount12);
        System.out.println("18  "+InterestAmount18);
        System.out.println("24  "+InterestAmount24);
        System.out.println("36  "+InterestAmount36);
    }
}