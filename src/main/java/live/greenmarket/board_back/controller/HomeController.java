package live.greenmarket.board_back.controller;

import lombok.RequiredArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
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
    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping
    public ResponseEntity<String> loginPage() {
        return ResponseEntity.ok("Login Page");
    }

    @GetMapping("/bugsCrawling")
    public ResponseEntity<?> bugsCrawling() {

        try {
            Document bugsDoc = Jsoup.connect("https://music.bugs.co.kr/chart").get();
            Elements elements = bugsDoc.select("table.byChart");

            Iterator<Element> ranking = elements.select("strong").iterator();
            Iterator<Element> title = elements.select("p.title").iterator();
            Iterator<Element> artist = elements.select("p.artist").iterator();

            List<String> result = new ArrayList<>();
            while (ranking.hasNext()) {
                result.add(ranking.next().text() + "위 " + title.next().text() + " - " + artist.next().text());
            }

            return ResponseEntity.ok(result);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return ResponseEntity.ok(null);
    }
}
