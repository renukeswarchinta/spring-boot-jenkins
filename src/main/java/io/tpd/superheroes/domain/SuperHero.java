package io.tpd.superheroes.domain;

import lombok.Data;

@Data
public final class SuperHero {

    private  Long id;
    private String firstName;
    private String lastName;
    private String heroName;

    // Empty constructor is needed for Jackson to recreate the object from JSON
    public SuperHero() {
    }

    public SuperHero(String firstName, String lastName, String heroName) {
        this.id =id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.heroName = heroName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getHeroName() {
        return heroName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SuperHero superHero = (SuperHero) o;
        if (id != null ? !id.equals(superHero.id) : superHero.id != null) return false;
        if (firstName != null ? !firstName.equals(superHero.firstName) : superHero.firstName != null) return false;
        if (lastName != null ? !lastName.equals(superHero.lastName) : superHero.lastName != null) return false;
        return heroName != null ? heroName.equals(superHero.heroName) : superHero.heroName == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (heroName != null ? heroName.hashCode() : 0);
        return result;
    }
}
