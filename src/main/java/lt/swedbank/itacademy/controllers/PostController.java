package lt.swedbank.itacademy.controllers;

import lt.swedbank.itacademy.beans.documents.Post;
import lt.swedbank.itacademy.beans.response.PostResponse;
import lt.swedbank.itacademy.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/")
public class PostController {

    // www.jusupuslapis.lt/ - GET [ gaunam visus blogo irasus ]
    // www.jusupuslapis.lt/add - POST [ pridedam nauja blogo irasa ]
    // www.jusupuslapis.lt//{id} - PUT [ redaguojam esama irasa ]
    // www.jusupuslapis.lt//delete/{id} - DELETE [ istrinam esama irasa ]

    @Autowired
    private PostService service;

    // manopuslapis.lt/
    // GET
    @RequestMapping(value = "/")
    public List<PostResponse> getAllPosts() {
        return service.getAllPosts();
    }

    // manopuslapis.lt/add
    // POST
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public PostResponse addPost(@Valid @RequestBody Post post) {
        return new PostResponse(service.addNewPost(post));
    }

    // manopuslapis.lt/update/{id}
    // PUT
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public PostResponse updatePost(@Valid @RequestBody Post post, @PathVariable("id") String id) {
        return new PostResponse(service.updateBlogPost(id, post));
    }

    // manopuslapis.lt/delete/{id}
    // DELETE
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void removePost(@PathVariable("id") String id) {
        service.deleteBlogPost(id);
    }

}
