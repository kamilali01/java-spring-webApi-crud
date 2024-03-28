package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.Language;

public interface ILanguageService {
    List<Language> getAll();
    Language get(int id);
    void add(Language language) throws Exception;
    void delete(int id);
    void update(Language language);
}
