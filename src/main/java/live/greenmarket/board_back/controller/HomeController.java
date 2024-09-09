package live.greenmarket.board_back.controller;

import live.greenmarket.board_back.model.entity.UserEntity;
import live.greenmarket.board_back.model.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
@RequestMapping("/api")
public class HomeController {
    private final UserRepository userRepository;

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping
    public ResponseEntity<String> loginPage() {
        return ResponseEntity.ok("Login Page");
    }

    @GetMapping("/userCrawling")
    public ResponseEntity<Boolean> userCrawling() {

        try {
            Document bugsDoc = Jsoup.connect("https://music.bugs.co.kr/chart").get();
            Elements elements = bugsDoc.select("table.byChart");

            Iterator<Element> password = elements.select("strong").iterator();
            Iterator<Element> title = elements.select("p.title").iterator();
            Iterator<Element> artist = elements.select("p.artist").iterator();
            Iterator<Element> name = elements.select("p.artist").iterator();

            while (password.hasNext()) {
                userRepository.save((UserEntity.builder()
                        .username(artist.next().text())
                        .password(password.next().text())
                        .nickname(title.next().text())
                        .name(name.next().text())
                        .build()));
            }

            return ResponseEntity.ok(true);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.ok(false);
        }
    }
}
