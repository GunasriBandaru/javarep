package com.ivy.sep21;
//The Java class called Holiday is started below. An object of class Holiday represents a holiday during the year. This class has three instance variables:
//name, which is a String representing the name of the holiday
//day, which is an int representing the day of the month of the holiday
//month, which is a String representing the month the holiday is in
//Write a constructor for the class Holiday, which takes a String representing the name, an int representing the day, and a String representing the month as its arguments, and sets the class variables to these values.
//
//Write a method inSameMonth, which compares two instances of the class Holiday, and returns the Boolean value true if they have the same month, and false if they do not.
//
//Write a method avgDate which takes an array of base type Holiday as its argument, and returns a double that is the average of the day variables in the Holiday instances in the array. You may assume that the array is full (i.e. does not have any null entries).
//
//Write a piece of code that creates a Holiday instance with the name “Independence Day”, with the day “4”, and with the month “July”.
public class Holiday {

        private String name;
        private int day;
        private String month;
        public Holiday(String name, int day, String month)
        {         this.name = name;this.day = day;this.month = month;
        }

        static Boolean inSameMonth(Holiday h1,Holiday h2)
        {         if(h1.getMonth().equals(h2.getMonth()))
            return true;         return false;     }
        static double avgDate(Holiday h1[])
        {         double avg=0.0;
            for(int i=0;i<h1.length;i++)
            {             avg+=h1[i].getDay();          }
            return avg/h1.length;     }
        public String getName() {
            return name;     }
        public void setName(String name)
        {         this.name = name;
        }
        public int getDay()
        {         return day;
        }
        public void setDay(int day)
        {         this.day = day;
        }      public String getMonth()
        {         return month;
        }
        public void setMonth(String month)
        {         this.month = month;     }
        @Override
        public String toString()
        {         return  name + " : " + month + " : " +day  ;      }
        public static void main(String arg[])
        {
            Holiday [] holidays=new Holiday[5];
            holidays[0]=new Holiday("May Day",1,"may");
            holidays[1]=new Holiday("Independence Day",4,"july");
            holidays[2]=new Holiday("Happy Day",1,"jun");
            holidays[3]=new Holiday("Kushan Day",1,"may");
            holidays[4]=new Holiday("Womans Day",4,"jan");
            for (int i=0;i<holidays.length;i++)
            {             System.out.println(holidays[i]);
            }
            System.out.println(inSameMonth(holidays[0],holidays[3]));
            System.out.println(avgDate(holidays));
        } }


