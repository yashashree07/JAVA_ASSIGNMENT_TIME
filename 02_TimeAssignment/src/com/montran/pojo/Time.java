package com.montran.pojo;

public class Time
{
    public int hours;
    public int minutes;
    
    public void setTime(int h,int m)
    {
        hours = h;
        minutes = m;
       
    }
   
   
    public Time sum(Time time2)
    {
        Time time3=new Time();
        
        time3.minutes = minutes + time2.minutes;
        time3.hours = time3.minutes / 60;
        time3.minutes = time3.minutes % 60;
        time3.hours = hours + time2.hours;

        return(time3);
       
    }
    
    public void showTime()
    {
    	
    	System.out.println("\t" + hours + " : "+ minutes);
    }

}