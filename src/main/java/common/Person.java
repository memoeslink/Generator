package common;

public class Person {
    String forename;
    String surname;
    Gender gender;

    public Person() {
    }

    private Person(String forename, String surname, Gender gender) {
        this.forename = forename;
        this.surname = surname;
        this.gender = gender;
    }

    public static class PersonBuilder {
        String forename;
        String surname;
        Gender gender;

        public PersonBuilder() {
        }

        public PersonBuilder setForename(String forename) {
            this.forename = forename;
            return this;
        }

        public PersonBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public PersonBuilder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Person build() {
            return new Person(forename, surname, gender);
        }
    }
}
