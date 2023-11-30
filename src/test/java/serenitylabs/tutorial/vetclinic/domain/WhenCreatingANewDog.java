package serenitylabs.tutorial.vetclinic.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

public class WhenCreatingANewDog {
    @Test
    public void it_should_have_a_name()  {
        LocalDateTime birthday = LocalDateTime.now();
        Dog fido = Dog.called("Fido")
                      .ofBreed("Poodle")
                      .ofColour("Black")
                      .withFavouriteFood("Pizza")   //Optional field
                      .bornOn(birthday);

        Assertions.assertEquals("Fido", fido.getName());
        Assertions.assertEquals("Poodle", fido.getBreed());
        Assertions.assertEquals("Black", fido.getColour());
        Assertions.assertEquals("Pizza", fido.getFavouriteFood());
        Assertions.assertEquals(birthday, fido.getDateOfBirth());
    }

}
