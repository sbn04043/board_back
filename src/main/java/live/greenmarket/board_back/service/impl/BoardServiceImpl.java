package live.greenmarket.board_back.service.impl;

import live.greenmarket.board_back.model.domain.BoardModel;
import live.greenmarket.board_back.model.entity.BoardEntity;
import live.greenmarket.board_back.model.repository.BoardRepository;
import live.greenmarket.board_back.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    private final BoardRepository boardRepository;

    private int PAGE_SIZE = 5;

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
        return boardRepository.existsById(id);
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public boolean deleteById(Long id) {
        if (existsById(id)) {
            boardRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<BoardModel> getPaginationList(Long page) {
        return List.of();
    }
}
