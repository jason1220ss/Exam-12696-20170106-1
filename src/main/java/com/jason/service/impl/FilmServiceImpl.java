package com.jason.service.impl;

import com.jason.dto.Film;
import com.jason.dto.Page;
import com.jason.dto.ResponseData;
import com.jason.mapper.FilmMapper;
import com.jason.mapper.LanguageMapper;
import com.jason.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jason on 2017/1/5.
 */
@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmMapper filmMapper;

    public int insert(Film film) {
        return filmMapper.insert(film);
    }

    public int delete(Film film) {
        return filmMapper.delete(film);
    }

    public int update(Film film) {
        return filmMapper.update(film);
    }

    public Film selectById(Integer id) {
        Film film = filmMapper.selectById(id);
        return film;
    }

    public ResponseData<Film> select(Page page) {
        ResponseData<Film> data = new ResponseData<Film>();
        data.setTotalCount(filmMapper.selectCount((Film) page.getT()));
        data.setRows(filmMapper.select(page));
        return data;
    }
}
