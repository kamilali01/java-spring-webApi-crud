package Kodlama.io.Devs.entities.concretes;

public class Language {

    public Language() {

    }

    public Language(int id, String name) {
        Id = id;
        Name = name;
    }

    private int Id;
    private String Name;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
