import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvFileSource;
import sportsmen.Category;
import sportsmen.Sportsman;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SportsmenTests {

    @ParameterizedTest
    @CsvFileSource(resources = "/sportsmenParameters.csv")
    public void calculateCategoryParametrized(double weigh, String categoryTitle) {
        Sportsman ivan = new Sportsman(weigh);
        String expectedCategory = categoryTitle;
        String factCategory = ivan.getCategory().getTitle();
        assertEquals(expectedCategory, factCategory, "Категория отличается от ожидаемой"); // comment
    }

}
