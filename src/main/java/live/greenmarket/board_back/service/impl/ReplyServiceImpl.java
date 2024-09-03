package live.greenmarket.board_back.service.impl;

import live.greenmarket.board_back.model.domain.ReplyModel;
import live.greenmarket.board_back.model.entity.ReplyEntity;
import live.greenmarket.board_back.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService {

    @Override
    public List<ReplyEntity> findAll() {
        return List.of();
    }

    @Override
    public ReplyEntity save(ReplyEntity entity) {
        return null;
    }

    @Override
    public Optional<ReplyEntity> findById(Long id) {
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
    public Map<?, ?> login(ReplyModel model) {
        return Map.of();
    }
}
