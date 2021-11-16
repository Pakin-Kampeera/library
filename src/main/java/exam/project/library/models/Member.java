package exam.project.library.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member {

    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String telephone;
    private String email;
}
