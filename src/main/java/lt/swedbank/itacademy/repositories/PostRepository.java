package lt.swedbank.itacademy.repositories;

import lt.swedbank.itacademy.beans.documents.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface
PostRepository extends CrudRepository<Post, String> {
    List<Post> findAll();

    Post findPostById(String id);
}
