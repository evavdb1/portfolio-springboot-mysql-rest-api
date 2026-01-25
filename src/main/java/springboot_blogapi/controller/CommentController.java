package springboot_blogapi.controller;
import springboot_blogapi.model.Comment;
import springboot_blogapi.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/comments")
public class CommentController {

    private CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/posts/{postId}")
    public Comment createComment(@PathVariable Long postId, @RequestBody Comment comment) {
        return commentService.addCommentToPost(postId, comment);
    }

    @PutMapping("/{id}")
    public Comment updateComment(@PathVariable Long id, @RequestBody Comment updatedComment) {
        return commentService.updateCommentById(id, updatedComment);
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable Long id) {
        commentService.deleteCommentById(id);
    }
}
