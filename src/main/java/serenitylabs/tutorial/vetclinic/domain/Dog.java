package serenitylabs.tutorial.vetclinic.domain;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Dog {
    private final String name;
    private final String breed;

    private final String colour;
    private final LocalDateTime dateOfBirth;
    private final String favouriteFood;

    private Dog(String name, String breed, String colour, String favoriteFood, LocalDateTime dateOfBirth) {
        this.name = name;
        this.breed = breed;
        this.colour = colour;
        this.favouriteFood = favoriteFood;  //Optional field
        this.dateOfBirth = dateOfBirth;
    }

    public static WithBreed called(String name) {
        return new DogBuilder(name);
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

        public String getColour() {
        return colour;
    }

    interface WithBreed{
        OfColor ofBreed(String breed);
    }

    interface  OfColor{
        DogBuilder ofColour(String colour);
    }

    public static class DogBuilder implements WithBreed, OfColor {
        private String name;
        private String breed;
        private String favouriteFood;
        private String colour;

        public DogBuilder(String name){
            this.name = name;
        }
        public DogBuilder ofBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public Dog bornOn(LocalDateTime birthday) {
            return new Dog(name, breed, colour, favouriteFood, birthday);
        }

        public DogBuilder withFavouriteFood(String favoriteFood) {
            this.favouriteFood = favoriteFood;
            return this;
        }

        public DogBuilder ofColour(String colour) {
            this.colour = colour;
            return this;
        }





    }

}
