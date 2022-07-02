package com.Comparator;

public class ComparatorImplementaion {
    public static void main(String[] args)
    {
        Person firstPerson =  new Person("shivam",11145);
        Person secondPerson =  new Person("Raju",2367);
        Person thirdPerson =  new Person("Golu",1234);
        Person fourthPerson =  new Person("Ram",98684);
        Person fivePerson =  new Person("Shyam",111);
        Person sixPerson =  new Person("Bablu",111);
        Person sevenPerson =  new Person("Garima",111);
        Person eightPerson =  new Person("Chad",222);
        Person ninePerson =  new Person("lol",222);

        Checker c1 = new Checker();
        int ans= c1.compare(sixPerson,sevenPerson);
        System.out.println(ans);
    }
}
