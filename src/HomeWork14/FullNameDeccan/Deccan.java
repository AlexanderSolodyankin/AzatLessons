package HomeWork14.FullNameDeccan;

import java.util.Scanner;

public class Deccan {
    private String nameDeccan;
    private String serrNameDeccan;
    private String patronDeccan;
    private Scanner sc;

    public Deccan(String name, String serrName, String patron){
        setNameDeccan(name);
        setSerrNameDeccan(serrName);
        setPatronDeccan(patron);
    }

    public String getNameDeccan() {
        return nameDeccan;
    }

    public void setNameDeccan(String nameDeccan) {
        this.nameDeccan = nameDeccan;
    }

    public String getSerrNameDeccan() {
        return serrNameDeccan;
    }

    public void setSerrNameDeccan(String serrNameDeccan) {
        this.serrNameDeccan = serrNameDeccan;
    }

    public String getPatronDeccan() {
        return patronDeccan;
    }

    public void setPatronDeccan(String patronDeccan) {
        this.patronDeccan = patronDeccan;
    }

    public String toString(){
        return String.format("Преподователь: \n" +
                "Имя: %s\n" +
                "Фамилия: %s \n" +
                "Отчество: %s \n",
                getNameDeccan(), getSerrNameDeccan(), getPatronDeccan());
    }
}
