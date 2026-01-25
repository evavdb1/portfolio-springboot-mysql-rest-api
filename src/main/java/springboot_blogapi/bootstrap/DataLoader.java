package springboot_blogapi.bootstrap;
import springboot_blogapi.model.Comment;
import springboot_blogapi.model.Post;
import springboot_blogapi.repository.CommentRepository;
import springboot_blogapi.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    public DataLoader(PostRepository postRepository, CommentRepository commentRepository) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        //check if any data is already present in DB
        if (postRepository.count() > 0) {
            return;
        }

        // fill with some data
        Post postA = new Post();
        postA.setTitle("Summer vibez");
        postA.setDescription("winter in Australia");
        postA.setContent("so nice, this sun and pool down under");
        postRepository.save(postA);

        Comment commentA01 = new Comment();
        commentA01.setText("enjoy your vacation!");
        commentA01.setPost(postA);
        postA.getComments().add(commentA01);

        Comment commentA02 = new Comment();
        commentA02.setText("weather here is not nice, stay there");
        commentA02.setPost(postA);
        postA.getComments().add(commentA02);



        Post postB = new Post();
        postB.setTitle("Mitzi going crazy");
        postB.setDescription("cats");
        postB.setContent("got new toys, great success");
        postRepository.save(postB);

        Comment commentB01 = new Comment();
        commentB01.setText("so cute...");
        commentB01.setPost(postB);
        postB.getComments().add(commentB01);
        commentRepository.save(commentB01);

        Comment commentB02 = new Comment();
        commentB02.setText("energetic little furball!");
        commentB02.setPost(postB);
        postB.getComments().add(commentB02);
        commentRepository.save(commentB02);

        Comment commentB03 = new Comment();
        commentB03.setText("spoiled cat");
        commentB03.setPost(postB);
        postB.getComments().add(commentB03);
        commentRepository.save(commentB03);


        Post postC = new Post();
        postC.setTitle("endless studying");
        postC.setDescription("exams");
        postC.setContent("no sweat no glory");
        postRepository.save(postC);

        Comment commentC01 = new Comment();
        commentC01.setText("good luck!");
        commentC01.setPost(postC);
        postC.getComments().add(commentC01);
        commentRepository.save(commentC01);

        Comment commentC02 = new Comment();
        commentC02.setText("don't get too excited. is too hard for you");
        commentC02.setPost(postC);
        postC.getComments().add(commentC02);
        commentRepository.save(commentC02);


        Post postD = new Post();
        postD.setTitle("Tech stuff");
        postD.setDescription("resolutions");
        postD.setContent("nothing like fixing your code without creating 2 new problems");
        postRepository.save(postD);

        Comment commentD01 = new Comment();
        commentD01.setText("you said it Stan, good luck!");
        commentD01.setPost(postD);
        postC.getComments().add(commentD01);
        commentRepository.save(commentD01);

        Comment commentD02 = new Comment();
        commentD02.setText("amen");
        commentD02.setPost(postD);
        postD.getComments().add(commentD02);
        commentRepository.save(commentD02);

    }
}
