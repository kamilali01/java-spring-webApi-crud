package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.ILanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.ILanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements ILanguageService {
    private ILanguageRepository languageRepository;

    @Autowired
    public LanguageManager(ILanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public Language get(int id) {
        return languageRepository.get(id);
    }

    @Override
    public void add(Language language) throws Exception {

        if (findName(language.getName())) {
            throw new Exception("!!Bu isim zaten kullaniliyor!!");
        }
        if (language.getName().isEmpty()) {
            throw new Exception("!!Isim bos gecilemez!!");
        }
        languageRepository.add(language);
    }

    private boolean findName(String name) {
        for (Language iterableElement : languageRepository.getAll()) {
            if (name.equals(iterableElement.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void delete(int id) {
        languageRepository.delete(id);
    }

    @Override
    public void update(Language language) {
        languageRepository.update(language);
    }

}
