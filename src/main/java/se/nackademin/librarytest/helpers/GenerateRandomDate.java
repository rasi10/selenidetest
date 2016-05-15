/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.librarytest.helpers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 *
 * @author rafael
 */
public class GenerateRandomDate {
    
    public String generateRandomPublishDateDate(){
        int randomNumberOfDays = new Random().nextInt(5000);		
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");	
        Calendar calendar = new GregorianCalendar();		
        calendar.add(Calendar.DATE, - randomNumberOfDays);		
        String dateAsString = sdf.format(calendar.getTime());		
        return dateAsString;
		
    }
}
