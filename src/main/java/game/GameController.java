package game;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    @RequestMapping("/game")
    public String gameState(){
        return "Hullo";
    }
}