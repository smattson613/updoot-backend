package dev.updooters.controllers;

import dev.updooters.entities.Reply;
import dev.updooters.services.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ReplyController {

    @Autowired
    ReplyService replyService;

    @PostMapping("/replies")
    public ResponseEntity<Reply> postReply(@RequestBody Reply reply){
        Reply postedReply = this.replyService.postReply(reply);
        return new ResponseEntity<>(postedReply, HttpStatus.CREATED);
    }

    @GetMapping("/replies")
    public ResponseEntity<List<Reply>> getReplies(){
        return new ResponseEntity<>(this.replyService.getAllReplies(), HttpStatus.OK);
    }

    @GetMapping("/replies/{id}")
    public ResponseEntity<List<Reply>> getRepliesByThreadId(@PathVariable("id") int id){
        return new ResponseEntity<>(this.replyService.getAllRepliesByPostId(id), HttpStatus.OK);
    }

    @PatchMapping("/replies/{id}")
    public int updootReply(@PathVariable("id") int id){
        return this.replyService.updootReply(id);
    }
}
