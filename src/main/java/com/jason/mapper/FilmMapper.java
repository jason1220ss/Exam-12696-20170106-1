package com.jason.mapper;

import com.jason.dto.Film;
import com.jason.dto.Page;

import java.util.List;

/**
 * Created by jason on 2017/1/4.
 */
public interface FilmMapper {
    int insert(Film film);

    int delete(Film film);

    int update(Film film);

    Film selectById(Integer id);
    List<Film> select(Page page);
    int selectCount(Film film);
}
