package com.tech552.TechBlog.repos;

import com.tech552.TechBlog.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends CrudRepository<Post, Long> {


}
