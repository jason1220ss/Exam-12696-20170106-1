package com.jason.service.impl;

import com.jason.dto.Language;
import com.jason.dto.ResponseData;
import com.jason.mapper.LanguageMapper;
import com.jason.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jason on 2017/1/5.
 */
@Service
public class LanguageServiceImpl implements LanguageService {

    @Autowired
    private LanguageMapper languageMapper;
    public Language insert(Language language) {
        return null;
    }

    public int delete(int id) {
        return languageMapper.delete(id);
    }

    public int update(Language language) {
        return 0;
    }

    public ResponseData<Language> selectAll() {
        ResponseData<Language> data = new ResponseData<Language>();
        data.setTotalCount(languageMapper.selectCount());
        data.setRows(languageMapper.selectAll());
        return data;
    }

    public int selectCount() {
        return languageMapper.selectCount();
    }
}
