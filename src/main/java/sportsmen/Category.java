package sportsmen;

public enum Category {

    LIGHT("Легкий вес"),
    MEDIUM("Средний вес"),
    HEAVY("Тяжелый вес"),
    SUPERHEAVY("Супертяжелый вес");

    private String title;

    Category(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
