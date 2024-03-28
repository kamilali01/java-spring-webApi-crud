package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.Language;

public interface ILanguageRepository {
    List<Language> getAll();
    Language get(int id);
    void add(Language language);
    void delete(int id);
    void update(Language language);
}
