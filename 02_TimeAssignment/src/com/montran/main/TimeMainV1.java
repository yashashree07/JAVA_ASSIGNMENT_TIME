package com.montran.main;



import com.montran.pojo.Time;


class TimeMainV1
{
    public static void main(String args[])
    {
        Time time1=new Time();
        Time time2=new Time();
        Time time3=new Time();
       
        time1.setTime(5,10);
        time2.setTime(6,40);
        time3=time1.sum(time2);
        
        System.out.println("\n---Hours---Minutes---\n"); 
        time1.showTime();
        time2.showTime();  
        System.out.println("\n---------------------\n");
        time3.showTime();
    }
}



	


