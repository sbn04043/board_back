package live.greenmarket.board_back.model.repository;

import live.greenmarket.board_back.model.domain.UserModel;
import live.greenmarket.board_back.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    @Query(value = "SELECT * FROM user WHERE username=?1 AND password=?2", nativeQuery = true)
    UserModel auth(String username, String password);
}
