package com.example.examen;

public enum Language {
    ES("ES"),
    EN("EN"),
    FR("FR");
    private final String description; // es de tipo final, evita que se cree con el de la primera vez
    Language(String description){
        this.description = description;
    }
    public String toString(){
        return this.description;
    }
}
