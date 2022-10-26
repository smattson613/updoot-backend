package dev.updooters.controllers;

import dev.updooters.entities.Thread;
import dev.updooters.repos.ThreadRepo;
import dev.updooters.services.ThreadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/threads")
@CrossOrigin
public class ThreadController {

    @Autowired
    ThreadService threadService;

    @PostMapping
    public Thread createThread(@RequestBody Thread thread){
        return this.threadService.createThread(thread);
    }

    @GetMapping("/single/{id}")
    public Thread getSingleThread(@PathVariable("id") String id){
        return this.threadService.getSingleThread(Integer.parseInt(id));
    }

    @GetMapping
    public List<Thread> getThreads(){
        return threadService.getAllThreads();
    }

    // could user a query param in getThreads instead of a separate route, but it's all good
    @GetMapping("/{username}")
    public List<Thread> getUserThreads(@PathVariable("username") String username)
    {
        return threadService.getAllUserThreads(username);
    }

}
