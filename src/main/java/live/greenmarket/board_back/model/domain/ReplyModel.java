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
public class ReplyModel {
    private Long id;

    private String replyContent;

    private Date replyCreateDate;

    private Date replyModifyDate;

    private Long userId;

    private Long boardId;
}
