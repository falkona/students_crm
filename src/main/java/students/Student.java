package students;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

import static students.Constants.YEAR_SECONDS;

public abstract class Student {

    protected String fullName;
    protected long dateOfBirth;
    protected long enrollDate;
    protected String directionPrefix;

    public Student() {}

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(long dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(long enrollDate) {
        this.enrollDate = enrollDate;
    }

    public String getDirectionPrefix() {
        return directionPrefix;
    }

    public void setDirectionPrefix(String direction) { this.directionPrefix = direction; }

    protected String getYearOfStudy() {
        return Long.toString(1 + (LocalDateTime.now().toEpochSecond(ZoneOffset.UTC) - this.enrollDate) / YEAR_SECONDS);
    }

}
