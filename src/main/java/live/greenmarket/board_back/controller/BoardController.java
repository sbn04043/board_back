package live.greenmarket.board_back.controller;

import live.greenmarket.board_back.model.domain.BoardModel;
import live.greenmarket.board_back.model.entity.BoardEntity;
import live.greenmarket.board_back.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
@RequestMapping("/api/boards")
public class BoardController {
    public List<BoardEntity> findAll() {
        return List.of();
    }

    public BoardEntity save(BoardEntity entity) {
        return null;
    }

    public Optional<BoardEntity> findById(Long id) {
        return Optional.empty();
    }

    public boolean existsById(Long id) {
        return false;
    }

    public long count() {
        return 0;
    }

    public void deleteById(Long id) {

    }

    public Map<?, ?> login(BoardModel model) {
        return Map.of();
    }
}
