package live.greenmarket.board_back.service;

import live.greenmarket.board_back.model.domain.BoardModel;
import live.greenmarket.board_back.model.entity.BoardEntity;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface BoardService {
    List<BoardEntity> findAll();

    BoardEntity save(BoardEntity entity);

    Optional<BoardEntity> findById(Long id);

    boolean existsById(Long id);

    long count();

    boolean deleteById(Long id);

    List<BoardModel> getPaginationList(Long page);
}
