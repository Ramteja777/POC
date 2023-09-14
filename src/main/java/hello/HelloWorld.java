package hello;

import org.joda.time.DateTime;

import org.joda.time.DateTimeZone;

 

public class HelloWorld {

  public static void main(String[] args) {

    DateTimeZone customTimeZone = DateTimeZone.forOffsetHoursMinutes(5, 30);

    DateTime dateTime = DateTime.now(customTimeZone);

    System.out.println("Current Date and Time (Custom Time Zone): " + dateTime);

    Greeter greeter = new Greeter();

    System.out.println(greeter.sayHello());

  }

}
