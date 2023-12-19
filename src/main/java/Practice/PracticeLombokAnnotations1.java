package Practice;

import Data.Actor;
import lombok.extern.slf4j.Slf4j;


public class PracticeLombokAnnotations1 {
    public static void main(String[] args) {
        final Actor APURBO =  Actor.builder()
                .id(1)
                .name("Apurbo")
                .topRole("Boro Chhele")
                .build();

    }
}
