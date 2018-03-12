package lt.swedbank.itacademy.beans.response;


import lt.swedbank.itacademy.beans.documents.Post;

public class PostResponse extends Response {

    private String id;
    private String title;
    private String content;

    public PostResponse() {}

    public PostResponse(Post post) {
        this.id = String.valueOf(post.getId());
        this.title = post.getTitle();
        this.content = post.getContent();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
