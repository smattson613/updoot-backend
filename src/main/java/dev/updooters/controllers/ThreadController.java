package dev.updooters.controllers;

import dev.updooters.entities.Thread;
import dev.updooters.repos.ThreadRepo;
import dev.updooters.services.ThreadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ThreadController {

    @Autowired
    ThreadService threadService;

    @PostMapping("/threads")
    public Thread createThread(@RequestBody Thread thread){
        return this.threadService.createThread(thread);
    }
}
