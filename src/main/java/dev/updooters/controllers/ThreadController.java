package dev.updooters.controllers;

import dev.updooters.entities.Thread;
import dev.updooters.services.ThreadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class ThreadController {

    @Autowired
    ThreadService threadService;

    @GetMapping("/threads")
    public List<Thread> getThreads(){
        return threadService.getAllThreads();
    }

}
