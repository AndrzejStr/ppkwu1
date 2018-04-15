package zadanie1.reverse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/zadanie1")
public class ReverseController {
	@RequestMapping("/{word}")
    public String mainPage(@PathVariable("word") String word) {
		StringBuffer inputWord = new StringBuffer(word);
        return inputWord.reverse().toString();
}
}