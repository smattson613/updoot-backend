package dev.updooters.controllers;

import dev.updooters.entities.UpdootedReply;
import dev.updooters.services.UpdootedReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/updooted-replies")
@CrossOrigin
public class UpdootedReplyController {

    @Autowired
    UpdootedReplyService updootedReplyService;

    @PostMapping
    public ResponseEntity<UpdootedReply> postUpdootedReply(@RequestBody UpdootedReply updootedReply){
        UpdootedReply added = this.updootedReplyService.postUpdootedReply(updootedReply);
        return new ResponseEntity<>(added, HttpStatus.CREATED);
    }

    @GetMapping("/{accountId}/{replyId}")
    public boolean getUpdootedReply(@PathVariable("accountId") int accountId, @PathVariable("replyId") int replyId){
        return updootedReplyService.getUpdootedReply(accountId, replyId);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> removeUpdootedReply(@PathVariable("id") int urId){
        this.updootedReplyService.removeUpdootedReply(urId);
        return new ResponseEntity<>("Removed updoot for reply.", HttpStatus.OK);
    }
}
