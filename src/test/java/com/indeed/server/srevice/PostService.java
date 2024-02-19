
package com.indeed.server.srevice;
import com.indeed.server.model.PostModel;
import lombok.Data;
import com.indeed.server.dto.PostDto;

public interface PostService {

    public PostModel savePost(PostDto postDto);
}
