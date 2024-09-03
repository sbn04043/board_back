package live.greenmarket.board_back.service;

import live.greenmarket.board_back.model.domain.ReplyModel;
import live.greenmarket.board_back.model.entity.ReplyEntity;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface ReplyService {
    List<ReplyEntity> findAll();

    ReplyEntity save(ReplyEntity entity);

    Optional<ReplyEntity> findById(Long id);

    boolean existsById(Long id);

    long count();

    void deleteById(Long id);

    Map<?,?> login(ReplyModel model);
}
