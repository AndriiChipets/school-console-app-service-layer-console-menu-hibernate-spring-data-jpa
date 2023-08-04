package ua.prom.roboticsdmc.domain;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder(setterPrefix = "with")
public class User {

    private final int userId;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;

}
