package live.greenmarket.board_back.service.impl;

import live.greenmarket.board_back.model.domain.BoardModel;
import live.greenmarket.board_back.model.entity.BoardEntity;
import live.greenmarket.board_back.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    @Override
    public List<BoardEntity> findAll() {
        return List.of();
    }

    @Override
    public BoardEntity save(BoardEntity entity) {
        return null;
    }

    @Override
    public Optional<BoardEntity> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Map<?, ?> login(BoardModel model) {
        return Map.of();
    }
}
