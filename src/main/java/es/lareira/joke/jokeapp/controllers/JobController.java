package es.lareira.joke.jokeapp.controllers;

import es.lareira.joke.jokeapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {
    private final JokeService jokeService;

    public JobController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {
        model.addAttribute("joke", this.jokeService.getJoke());
        return "chucknorris";
    }
}
