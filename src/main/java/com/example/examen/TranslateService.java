package com.example.examen;

public class TranslateService {

    ApiTranslate apiTranslate;
    TranslateService (ApiTranslate apiTranslate){
        this.apiTranslate = apiTranslate;
    }

    public String translate(TranslateRequestDto translateRequestDto){
        return apiTranslate.translate(translateRequestDto.message(),
                translateRequestDto.source().toString(),
                translateRequestDto.target().toString());
    }
}
