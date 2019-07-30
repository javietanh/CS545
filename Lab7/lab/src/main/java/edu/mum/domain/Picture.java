package edu.mum.domain;

import org.springframework.web.multipart.MultipartFile;

public class Picture {
    private String url;
    private MultipartFile content;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public MultipartFile getContent() {
        return content;
    }

    public void setContent(MultipartFile content) {
        this.content = content;
    }
}
