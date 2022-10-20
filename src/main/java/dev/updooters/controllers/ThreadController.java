package dev.updooters.controllers;

import dev.updooters.entities.Thread;
import dev.updooters.repos.ThreadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class ThreadController {

    @Autowired
    ThreadRepo threadRepo;

    @GetMapping("/threads")
    @ResponseBody
    public List<Thread> getAllThreads(){
        return this.threadRepo.findAll();
    }

}
