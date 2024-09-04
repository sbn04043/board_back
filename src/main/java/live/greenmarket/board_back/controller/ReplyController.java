package live.greenmarket.board_back.controller;

import live.greenmarket.board_back.model.domain.ReplyModel;
import live.greenmarket.board_back.model.entity.ReplyEntity;
import live.greenmarket.board_back.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
public class ReplyController implements ReplyService {
    public List<ReplyEntity> findAll() {
        return List.of();
    }

    public ReplyEntity save(ReplyEntity entity) {
        return null;
    }

    public Optional<ReplyEntity> findById(Long id) {
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

    public Map<?, ?> login(ReplyModel model) {
        return Map.of();
    }
}
