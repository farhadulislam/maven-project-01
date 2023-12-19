package Data;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

@NonNull
@Data
@Builder

public class Actor {

    private enum GENDER {MALE, FEMALE};
    private int id;
    private String name;
    private String topRole;
}
