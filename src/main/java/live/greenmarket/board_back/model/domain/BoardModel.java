package live.greenmarket.board_back.model.domain;

import live.greenmarket.board_back.model.entity.BoardEntity;
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

    public static BoardModel toBoardModel(BoardEntity entity) {
        return BoardModel.builder()
                .id(entity.getId())
                .boardTitle(entity.getBoardTitle())
                .boardContent(entity.getBoardContent())
                .boardCreateDate(entity.getBoardCreateDate())
                .boardModifyDate(entity.getBoardModifyDate())
                .userId(entity.getUserId())
                .build();
    }
}
