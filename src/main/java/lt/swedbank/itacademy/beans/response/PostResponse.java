package lt.swedbank.itacademy.beans.response;


import lt.swedbank.itacademy.beans.documents.Post;

public class PostResponse {

    private String title;
    private String content;

    public PostResponse() {}

    public PostResponse(Post post) {
        this.title = post.getTitle();
        this.content = post.getContent();
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
