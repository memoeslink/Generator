package common;

import java.time.LocalDate;

public class Person {
    private long id;
    private String fullName;
    private String forename;
    private String surname;
    private NameType nameType;
    private Gender gender;
    private String nickname;
    private String username;
    private String generationalSuffix;
    private String japaneseHonorific;
    private String postNominalLetters;
    private String address;
    private String email;
    private LocalDate birthdate;

    public Person() {
    }

    private Person(long id, String fullName, String forename, String surname, NameType nameType, Gender gender, String nickname, String username, String generationalSuffix, String japaneseHonorific, String postNominalLetters, String address, String email, LocalDate birthdate) {
        this.id = id;
        this.fullName = fullName;
        this.forename = forename;
        this.surname = surname;
        this.nameType = nameType;
        this.gender = gender;
        this.nickname = nickname;
        this.username = username;
        this.generationalSuffix = generationalSuffix;
        this.japaneseHonorific = japaneseHonorific;
        this.postNominalLetters = postNominalLetters;
        this.address = address;
        this.email = email;
        this.birthdate = birthdate;
    }

    public static class PersonBuilder {
        private long id;
        private String fullName;
        private String forename;
        private String surname;
        private NameType nameType;
        private Gender gender;
        private String nickname;
        private String username;
        private String generationalSuffix;
        private String japaneseHonorific;
        private String postNominalLetters;
        private String address;
        private String email;
        private LocalDate birthdate;

        public PersonBuilder() {
        }

        public PersonBuilder setId(long id) {
            this.id = id;
            return this;
        }

        public PersonBuilder setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public PersonBuilder setForename(String forename) {
            this.forename = forename;
            return this;
        }

        public PersonBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public PersonBuilder setNameType(NameType nameType) {
            this.nameType = nameType;
            return this;
        }

        public PersonBuilder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public PersonBuilder setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public PersonBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public PersonBuilder setGenerationalSuffix(String generationalSuffix) {
            this.generationalSuffix = generationalSuffix;
            return this;
        }

        public PersonBuilder setJapaneseHonorific(String japaneseHonorific) {
            this.japaneseHonorific = japaneseHonorific;
            return this;
        }

        public PersonBuilder setPostNominalLetters(String postNominalLetters) {
            this.postNominalLetters = postNominalLetters;
            return this;
        }

        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public PersonBuilder setBirthdate(LocalDate birthdate) {
            this.birthdate = birthdate;
            return this;
        }

        public Person build() {
            return new Person(id, fullName, forename, surname, nameType, gender, nickname, username, generationalSuffix, japaneseHonorific, postNominalLetters, address, email, birthdate);
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public NameType getNameType() {
        return nameType;
    }

    public void setNameType(NameType nameType) {
        this.nameType = nameType;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGenerationalSuffix() {
        return generationalSuffix;
    }

    public void setGenerationalSuffix(String generationalSuffix) {
        this.generationalSuffix = generationalSuffix;
    }

    public String getJapaneseHonorific() {
        return japaneseHonorific;
    }

    public void setJapaneseHonorific(String japaneseHonorific) {
        this.japaneseHonorific = japaneseHonorific;
    }

    public String getPostNominalLetters() {
        return postNominalLetters;
    }

    public void setPostNominalLetters(String postNominalLetters) {
        this.postNominalLetters = postNominalLetters;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}
