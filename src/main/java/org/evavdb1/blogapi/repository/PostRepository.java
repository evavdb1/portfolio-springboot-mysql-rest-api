package org.evavdb1.blogapi.repository;
import org.evavdb1.blogapi.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
