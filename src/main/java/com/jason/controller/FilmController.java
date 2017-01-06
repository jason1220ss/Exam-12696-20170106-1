package com.jason.controller;

import com.jason.dto.Film;
import com.jason.dto.Language;
import com.jason.dto.Page;
import com.jason.dto.ResponseData;
import com.jason.service.FilmService;
import com.jason.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jason on 2017/1/5.
 */
@Controller
public class FilmController {
    @Autowired
    private FilmService filmService;
    @Autowired
    private LanguageService languageService;

    @RequestMapping(value = "/select", method = RequestMethod.GET)
    @ResponseBody
    // required=false表示不传的话，会给参数赋值为null，required=true就是必须要有
    public ResponseData<Film> selectPage(@RequestParam(name = "title", required = false, defaultValue = "") String title,
                                         @RequestParam(name = "currentPage", required = false, defaultValue = "1") int currentPage,
                                         @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {
        Page page = new Page();
        page.setCurrentPage(currentPage);
        page.setPageSize(pageSize);
        page.setT(new Film().setTitle(title));
        ResponseData<Film> responseData = filmService.select(page);
        return responseData;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String deletePage(@RequestParam(name = "filmId", required = true) int filmId) {
        Film film = filmService.selectById(filmId);
        filmService.delete(film);
        return "/show.html";
    }

    @RequestMapping("/addUI")
    @ResponseBody
    public ResponseData<Language> addUI() {
        ResponseData<Language> responseData = languageService.selectAll();
        return responseData;
    }

    @RequestMapping("/addFilm")
    public String addFilm(Film film) {
        filmService.insert(film);
        return "/show.html";
    }

    @RequestMapping("/updateUI")
    @ResponseBody
    public Film updateUI(@RequestParam(name = "filmId", required = true) int filmId) {
        Film film = filmService.selectById(filmId);
        return film;
    }

    @RequestMapping("/updateFilm")
    public String updateFilm(Film film) {
        filmService.update(film);
        return "/show.html";
    }
}
