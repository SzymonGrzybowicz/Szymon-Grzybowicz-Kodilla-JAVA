package stream;

import com.kodilla.stream.World.Continent;
import com.kodilla.stream.World.Country;
import com.kodilla.stream.World.World;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class WorldTestSuite {

    public static int iterator;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Starting test #" + iterator);
        iterator++;
    }

    @Test
    public void testGetPeopleQuantity() {

        //Given
        Country countryOne = new Country(new BigDecimal("111111111111111111111111111111"), "countryOne");
        Country countryTwo = new Country(new BigDecimal("222222222222222222222222222222"), "countryTwo");
        Country countryThree = new Country(new BigDecimal("333333333333333333333333333333"), "countryThree");
        Country countryFour = new Country(new BigDecimal("444444444444444444444444444444"), "countryFour");

        Set<Country> countrySetOne = new HashSet<>();
        Set<Country> countrySetTwo = new HashSet<>();

        countrySetOne.add(countryOne);
        countrySetOne.add(countryTwo);

        countrySetTwo.add(countryThree);
        countrySetTwo.add(countryFour);


        Continent continentOne = new Continent("ContinentOne", countrySetOne);
        Continent continentTwo = new Continent("ContinentOne", countrySetTwo);

        Set<Continent> continentSet = new HashSet<>();

        continentSet.add(continentOne);
        continentSet.add(continentTwo);

        World earth = new World("Earth", continentSet);
        //When

        BigDecimal result = earth.getPeopleQuantity();
        BigDecimal expected = new BigDecimal("1111111111111111111111111111110");

        //Then

        Assert.assertEquals(expected, result);
    }

}
