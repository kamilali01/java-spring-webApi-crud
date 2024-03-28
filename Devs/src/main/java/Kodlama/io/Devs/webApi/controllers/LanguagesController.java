package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.ILanguageService;
import Kodlama.io.Devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

    private ILanguageService languageService;

    @Autowired
    public LanguagesController(ILanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getall")
    public List<Language> getAll(){
        return languageService.getAll();
    }

    @GetMapping("/get")
    public Language get(int id){
        return languageService.get(id);
    }

    @GetMapping("/add")
    public void add(Language language) throws Exception{
        languageService.add(language);
    }

    @GetMapping("/delete")
    public void delete(int id){
        languageService.delete(id);
    }

    @GetMapping("/update")
    public void update(Language language){
        languageService.update(language);
    }

}
