package live.greenmarket.board_back.service.impl;

import live.greenmarket.board_back.model.domain.UserModel;
import live.greenmarket.board_back.model.entity.UserEntity;
import live.greenmarket.board_back.model.repository.UserRepository;
import live.greenmarket.board_back.pattern.proxy.Pagination;
import live.greenmarket.board_back.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public List<UserEntity> findAll() {
        return List.of();
    }

    @Override
    public UserEntity save(UserEntity user) {
        return null;
    }

    @Override
    public Optional<UserEntity> findById(Long id) {
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
    public Map<?, ?> login(UserModel model) {
        return Map.of();
    }

    @Override
    public List<UserEntity> pagination(Pagination pagination) {
        System.out.println("pagination = " + pagination.toString());
        return userRepository.pagination(pagination.getStartRow(), pagination.getPAGE_SIZE());
    }
}
