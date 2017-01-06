package com.jason.service;

import com.jason.dto.Film;
import com.jason.dto.Page;
import com.jason.dto.ResponseData;

/**
 * Created by jason on 2017/1/5.
 */
public interface FilmService {
    int insert(Film film);

    int delete(Film film);

    int update(Film film);

    Film selectById(Integer id);
    ResponseData<Film> select(Page page);
}
