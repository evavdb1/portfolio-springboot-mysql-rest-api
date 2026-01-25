package springboot_blogapi.service;
import springboot_blogapi.exception.ResourceNotFoundException;
import springboot_blogapi.model.*;
import springboot_blogapi.model.Comment;
import springboot_blogapi.model.Post;
import springboot_blogapi.repository.PostRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Set;

@Service
@Transactional
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    // just return an empty list, only if business logic requires at least one post, throwing makes sense.
    public List<Post> getAllPosts() {
        return postRepository.findAll()
                .stream().toList();
    }

    public Post getPostById(Long id) {
        return postRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("post not found with id: " + id));
    }

    public Post updatePostById(Long id, Post updatedPost) {
        return postRepository.findById(id)
                .map(oldPost -> {
                    oldPost.setTitle(updatedPost.getTitle());
                    oldPost.setDescription(updatedPost.getDescription());
                    oldPost.setContent(updatedPost.getContent());
                    return postRepository.save(oldPost);
                })
                .orElseThrow(() -> new ResourceNotFoundException("post not found with id: " + id));
    }

    public void deletePostById(Long id) {
        boolean postExists = postRepository.existsById(id);
        if (!postExists) {
            throw new ResourceNotFoundException("post not found with id: " + id);
        }
        postRepository.deleteById(id);
    }

    public Set<Comment> getAllCommentsByPostId(Long postId) {
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new ResourceNotFoundException("post not found with id: " + postId));
        return post.getComments();
    }
}
