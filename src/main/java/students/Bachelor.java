package students;

public class Bachelor extends Student {

    private String certificate;

    public Bachelor() {}

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getGroup() {
        String year = getYearOfStudy();
        return "Б-" + this.directionPrefix + "-" + year;
    }

}
