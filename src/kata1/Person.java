package kata1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
    private final String name;
    private final LocalDate birthdate;

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    public long getAge(){
        long years = ChronoUnit.YEARS.between(birthdate, LocalDate.now());
        return years;
    }
}

