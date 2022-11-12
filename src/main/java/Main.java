import students.Bachelor;

public class Main {

    public static void main (String[] args) {
        Bachelor daria = new Bachelor();
        daria.setFullName("Нос Дарья Дмитриевна");
        daria.setDirectionPrefix("ПМИ");
        daria.setDateOfBirth(666844081);
        daria.setEnrollDate(1598927281);

        System.out.println(daria.getGroup());
        System.out.println(daria.getFullName());

    }
}
