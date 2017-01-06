package com.jason.service;

import com.jason.dto.Language;
import com.jason.dto.ResponseData;

/**
 * Created by jason on 2017/1/5.
 */
public interface LanguageService {
    Language insert(Language language);
    int delete(int id);
    int update(Language language);
    ResponseData<Language> selectAll();
    int selectCount();
}
