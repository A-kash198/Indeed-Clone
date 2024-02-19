package com.indeed.server.srevice;

import com.indeed.server.dao.PostDao;
import com.indeed.server.dto.PostDto;
import com.indeed.server.model.PostModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceimp implements PostService  {
@Autowired
PostDao postDao;
    @Override
    public PostModel savePost(PostDto postDto) {

      PostModel postModel=new PostModel();

      postModel.setProfile(postDto.getProfile());
      postModel.setDescription(postDto.getDescription());
      postModel.setSalary(postDto.getSalary());
      postModel.setTechnology(postDto.getTechnology());
      postModel.setType(postDto.getType());
      postModel.setExperience(postDto.getExperience());

    return  postDao.save(postModel);
    }
}
