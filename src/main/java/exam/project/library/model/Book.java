package exam.project.library.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Book {
    private Long id;

    @NotBlank(message = "Title is required.")
    private String title;

    @NotBlank(message = "Price is required.")
    private String price;

    @NotBlank(message = "Publisher is required.")
    private String publisherId;

    @NotEmpty(message = "Author is required.")
    private Set<String> authorId;

    private Publisher publisher;

    private Set<Author> authors;
}
