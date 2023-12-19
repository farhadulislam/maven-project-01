package Data;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Setter
@Getter
@ToString
@NonNull
public class Person {
    private String name;
    private int age;
    private String role;
}
