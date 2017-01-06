package com.jason.mapper;

import com.jason.dto.Language;

import java.util.List;

/**
 * Created by jason on 2017/1/5.
 */
public interface LanguageMapper {
    Language insert(Language language);
    int delete(int id);
    int update(Language language);
    List<Language> selectAll();
    int selectCount();
}
