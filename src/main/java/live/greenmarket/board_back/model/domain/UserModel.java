package live.greenmarket.board_back.model.domain;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserModel {
    private Long id;

    private String username;

    private String password;

    private String nickname;

    private String name;
}
