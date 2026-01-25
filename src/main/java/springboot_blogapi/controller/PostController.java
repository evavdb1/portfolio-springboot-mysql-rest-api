package springboot_blogapi.controller;
import springboot_blogapi.model.*;
import springboot_blogapi.model.Comment;
import springboot_blogapi.model.Post;
import springboot_blogapi.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("api/posts")
public class PostController {

	private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return postService.savePost(post);
    }

    @GetMapping("/{id}")
    public Post searchPostById(@PathVariable Long id) {
        return postService.getPostById(id);
    }

    @GetMapping
    public List<Post> searchAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/{id}/comments")
    public Set<Comment> searchAllCommentsByPost(@PathVariable Long id) {
        return postService.getAllCommentsByPostId(id);
    }

    @PutMapping("/{id}")
    public Post updatePost(@PathVariable Long id, @RequestBody Post post) {
        return postService.updatePostById(id, post);
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable Long id) {
        postService.deletePostById(id);
    }
}
