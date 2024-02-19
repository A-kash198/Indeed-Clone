package com.indeed.server.controller;

import com.indeed.server.dto.PostDto;
import com.indeed.server.model.PostModel;
import com.indeed.server.srevice.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin
public class PostController {

    final PostService postService;

    @PostMapping("/posts")
    public PostModel savePost(@Valid @RequestBody PostDto postDtoRequest) {
        log.info("Saving post ######");

        return this.postService.savePost(postDtoRequest);
    }


}
