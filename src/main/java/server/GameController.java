package server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import server.Game;

@RestController
@RequestMapping("/game")
public class GameController {
    @Autowired
    private Game game;
}
