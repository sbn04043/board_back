package live.greenmarket.board_back.controller;

import live.greenmarket.board_back.model.domain.UserModel;
import live.greenmarket.board_back.model.entity.UserEntity;
import live.greenmarket.board_back.model.repository.UserRepository;
import live.greenmarket.board_back.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
@RequestMapping("/api/users")
public class UserController {
    private final UserRepository userRepository;
    private final UserService userService;

    @GetMapping("/list")
    public ResponseEntity<List<UserModel>> findAll() {
        return ResponseEntity.ok(userRepository.findAll().stream().map(userEntity -> UserModel.builder()
                .id(userEntity.getId())
                .username(userEntity.getUsername())
                .name(userEntity.getName())
                .nickname(userEntity.getNickname())
                .build()).toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserEntity> findById(@PathVariable long id) {
        return ResponseEntity.ok(userRepository.findById(id).get());
    }

    @PostMapping("/")
    public ResponseEntity<UserEntity> insert(@RequestBody UserModel model) {
        return ResponseEntity.ok(userRepository.save(UserEntity.builder()
                .username(model.getUsername())
                .password(model.getPassword())
                .name(model.getName())
                .nickname(model.getNickname())
                .build()));
    }

    @PutMapping("/")
    public ResponseEntity<UserEntity> update(@RequestBody UserModel model) {
        return ResponseEntity.ok(userRepository.save(UserEntity.builder()
                .id(model.getId())
                .username(model.getUsername())
                .password(model.getPassword())
                .name(model.getName())
                .nickname(model.getNickname())
                .build()));
    }

    @DeleteMapping("/")
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    public Optional<UserEntity> findById(Long id) {
        return Optional.empty();
    }

    public boolean existsById(Long id) {
        return false;
    }

    public long count() {
        return 0;
    }
}
