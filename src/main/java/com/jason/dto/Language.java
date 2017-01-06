package com.jason.dto;

/**
 * Created by jason on 2017/1/4.
 */
public class Language {
//    @NotNull
    private Integer languageId;
    private String name;

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
