package poc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IdentityUk {
    private Long id;
    private String firstName;
    private String lastName;
    private String postCode;
}
