package com.spartaglobal.SOLID_shop;

import com.spartaglobal.SOLID_shop.OpenClosedPrinciple.DiscountManager;
import com.spartaglobal.SOLID_shop.OpenClosedPrinciple.FantasyFilmDiscount;
import com.spartaglobal.SOLID_shop.Students.ManageStudents;
import com.spartaglobal.SOLID_shop.Students.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
//        FantasyFilmDiscount fantasyFilmDiscount = new FantasyFilmDiscount();
//        fantasyFilmDiscount.setDiscount("20%");
//        DiscountManager discountManager = new DiscountManager();
//        discountManager.processDiscount(fantasyFilmDiscount);

        Student pawel = new Student("Pawel", "Misiura", "Java SDET");

        ManageStudents manageStudents = new ManageStudents();

        manageStudents.printName(pawel.getFirstName(), pawel.getLastName());
    }
}
