package com.blog.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class PostCreate {

    public String title;
    public String content;

}
