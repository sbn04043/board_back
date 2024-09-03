package live.greenmarket.board_back.model.domain;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardModel {
    private Long id;

    private String boardTitle;

    private String boardContent;

    private Date boardCreateDate;

    private Date boardModifyDate;

    private Long userId;
}
