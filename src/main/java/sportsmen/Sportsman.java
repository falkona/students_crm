// Известен вес боксера-любителя.
// Известно, что вес таков, что боксер может быть отнесен к одной из трех весовых категорий:
// 1.легкий вес — до 60 кг;
// 2.средний вес — до 75 кг;
// 3.тяжелый вес — до 91 кг;
// 4.супертяжелый вес – с 91 кг.
// Определить, в какой категории будет выступать данный боксер.

package sportsmen;

public class Sportsman {

    private double weigh;
    private Category category;

    public Sportsman(double weigh) {
        this.weigh = weigh;
        this.category = calculateCategory();
    }

    public double getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
        this.category = calculateCategory();
    }

    public Category calculateCategory() {
        if (this.weigh < 60) {
            return Category.LIGHT;
        } else if (this.weigh < 75) {
            return Category.MEDIUM;
        } else if (this.weigh < 91) {
            return Category.HEAVY;
        } else {
            return Category.SUPERHEAVY;
        }
    }

    public Category getCategory() {
        return category;
    }

}

