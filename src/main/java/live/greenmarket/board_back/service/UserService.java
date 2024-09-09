package live.greenmarket.board_back.service;

import live.greenmarket.board_back.model.domain.UserModel;
import live.greenmarket.board_back.model.entity.UserEntity;
import live.greenmarket.board_back.pattern.proxy.Pagination;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface UserService {
    List<UserEntity> findAll();

    UserEntity save(UserEntity user);

    Optional<UserEntity> findById(Long id);

    boolean existsById(Long id);

    long count();

    void deleteById(Long id);

    Map<?,?> login(UserModel model);

    List<UserEntity> pagination(Pagination pagination);
}
