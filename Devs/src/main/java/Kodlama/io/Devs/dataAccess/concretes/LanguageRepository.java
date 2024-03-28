package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.ILanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;

@Repository
public class LanguageRepository implements ILanguageRepository {

    List<Language> languages;

    public LanguageRepository() {
        languages = new ArrayList<Language>();
        languages.add(new Language(0, "C#"));
        languages.add(new Language(1, "Java"));
        languages.add(new Language(2, "Python"));
        languages.add(new Language(3, "PHP"));
    }

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public Language get(int id) {
        // return languages.get(id);
        for (Language language : languages) {
            if(language.getId()==id){
                return language;
            }
        }
        return null;
    }

    @Override
    public void add(Language language) {
        languages.add(language);
    }

    @Override
    public void delete(int id) {
        languages.remove(id);
    }

    @Override
    public void update(Language language) {
        languages.set(language.getId(), language);
    }

}
