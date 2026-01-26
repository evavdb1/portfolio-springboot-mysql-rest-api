package org.evavdb1.blogapi.service;
import org.evavdb1.blogapi.exception.ResourceNotFoundException;
import org.evavdb1.blogapi.model.Comment;
import org.evavdb1.blogapi.model.Post;
import org.evavdb1.blogapi.repository.CommentRepository;
import org.evavdb1.blogapi.repository.PostRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private PostRepository postRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }


    public Comment addCommentToPost(Long postId, Comment comment) {
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new ResourceNotFoundException("post not found with id " + postId));

        comment.setPost(post);
        return commentRepository.save(comment);
    }

    public Comment updateCommentById(Long id, Comment updatedComment) {
        return commentRepository.findById(id)
                .map(oldComment -> {
                    oldComment.setText(updatedComment.getText());
                    return commentRepository.save(oldComment);
                })
                .orElseThrow(() -> new ResourceNotFoundException("comment not found with id " + id));
    }

    public void deleteCommentById(Long id) {
        boolean commentExists = commentRepository.existsById(id);
        if (!commentExists) {
            throw new ResourceNotFoundException("comment not found with id " + id);
        }
        commentRepository.deleteById(id);
    }
}
