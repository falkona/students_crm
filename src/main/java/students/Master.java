package students;

public class Master extends Student {

    private String diploma;

    public Master() {}

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }

    public String getGroup() {
        String year = getYearOfStudy();
        return "M-" + this.directionPrefix + "-" + year;
    }

}
