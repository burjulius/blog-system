package lt.swedbank.itacademy.services;

import lt.swedbank.itacademy.beans.documents.Post;
import lt.swedbank.itacademy.repositories.PostRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public List<Post> getAllPosts() {
        return repository.findAll();
    }

    public Post addNewPost(@Valid Post post) {
        Post newPost = new Post();

        newPost.setId(new ObjectId());
        newPost.setTitle(post.getTitle());
        newPost.setContent(post.getContent());
        newPost.setAuthor(post.getAuthor());
        newPost.setDate(post.getDate());

        return repository.save(newPost);
    }

    public Post updateBlogPost(String id, Post updatePostInfo) {
        // steps:
        // 1. get particular blog post
        // 2. update blog post
        // 3. save blog post
        Post post = repository.findPostById(id);

        post.setTitle(updatePostInfo.getTitle());
        post.setContent(updatePostInfo.getContent());
        post.setAuthor(updatePostInfo.getAuthor());

        return repository.save(post);
    }

    public void deleteBlogPost(String id) {
        repository.delete(repository.findPostById(id));
    }
}
