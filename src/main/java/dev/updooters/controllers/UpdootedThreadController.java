package dev.updooters.controllers;

import dev.updooters.entities.UpdootedThread;
import dev.updooters.services.UpdootedThreadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/updooted-threads")
@CrossOrigin
public class UpdootedThreadController {

    @Autowired
    UpdootedThreadService updootedThreadService;

    @PostMapping
    public ResponseEntity<UpdootedThread> postUpdootedThread(@RequestBody UpdootedThread updootedThread){
        UpdootedThread added = this.updootedThreadService.postUpdootedThread(updootedThread);
        return new ResponseEntity<>(added, HttpStatus.CREATED);
    }

    @GetMapping("/{accountId}/{threadId}")
    public boolean getUpdootedReply(@PathVariable("accountId") int accountId, @PathVariable("threadId") int threadId){
        return updootedThreadService.getUpdootedThread(accountId, threadId);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> removeUpdootedReply(@PathVariable("id") int utId){
        this.updootedThreadService.removeUpdootedThread(utId);
        return new ResponseEntity<>("Removed updoot for thread.", HttpStatus.OK);
    }
}
