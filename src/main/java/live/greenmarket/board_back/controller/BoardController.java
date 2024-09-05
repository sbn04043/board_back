package live.greenmarket.board_back.controller;

import live.greenmarket.board_back.model.domain.BoardModel;
import live.greenmarket.board_back.model.entity.BoardEntity;
import live.greenmarket.board_back.model.repository.BoardRepository;
import live.greenmarket.board_back.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
@RequestMapping("/api/boards")
public class BoardController {
    private final BoardService boardService;
    private final BoardRepository boardRepository;

    @PutMapping
    public ResponseEntity<?> updateBoard(@RequestBody BoardModel model) {
        return ResponseEntity.ok(BoardModel.toBoardModel(boardRepository.save(BoardEntity.builder()
                .id(model.getId())
                .boardTitle(model.getBoardTitle())
                .boardContent(model.getBoardContent())
                .boardCreateDate(model.getBoardCreateDate())
                .boardModifyDate(new Date())
                .userId(model.getUserId())
                .build())));
    }

    @GetMapping("/insertTestData")
    public ResponseEntity<Boolean> insertTestData() {
        try {
            for (int i = 0; i < 200; i++) {
                boardRepository.save(BoardEntity.builder()
                        .boardTitle("Board Title " + i)
                        .boardContent("Board Content " + i)
                        .boardCreateDate(new Date())
                        .boardModifyDate(new Date())
                        .userId(1L)
                        .build());
            }
            return ResponseEntity.ok(true);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.ok(false);
        }
    }

    @GetMapping("/list")
    public ResponseEntity<List<BoardEntity>> findAll() {
        return ResponseEntity.ok(boardRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<BoardModel> save(@RequestBody BoardModel model) {
        return ResponseEntity.ok(BoardModel.toBoardModel(boardRepository.save(BoardEntity.builder()
                .boardTitle(model.getBoardTitle())
                .boardContent(model.getBoardContent())
                .boardCreateDate(new Date())
                .boardModifyDate(new Date())
                .userId(1L)
                .build())));
    }

    @GetMapping("/{id}")
    public ResponseEntity<BoardModel> findById(@PathVariable Long id) {
        return ResponseEntity.ok(BoardModel.toBoardModel(boardRepository.findById(id).get()));
    }

    @GetMapping("/isExist/{id}")
    public ResponseEntity<Boolean> existsById(Long id) {
        return ResponseEntity.ok(boardRepository.existsById(id));
    }

    @GetMapping("/count")
    public ResponseEntity<Long> count() {
        return ResponseEntity.ok(boardRepository.count());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable Long id) {
        return ResponseEntity.ok(boardService.deleteById(id));
    }
}
