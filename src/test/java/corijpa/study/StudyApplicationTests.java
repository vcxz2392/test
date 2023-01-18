package corijpa.study;

import corijpa.study.entityListener.domain.Player;
import corijpa.study.entityListener.domain.repo.PlayerRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@SpringBootTest
@Rollback(value = false)
class StudyApplicationTests {

    @Autowired
    private PlayerRepository playerRepository;

    @BeforeEach
    void addProc() {
        playerRepository.save(Player.builder()
                        .id(1L)
                .name("valverde")
                .backNumber(15)
                .build());
    }

    @Test
    void persist_test() {
        playerRepository.save(Player.builder()
                .name("benzema")
                .backNumber(9)
                .build());
    }

    @Test
    void update_test() {
        var player = playerRepository.findById(1L).get();
        player.setBackNumber(222);
//        aaaa
    }

    @Test
    void remove_test() {
        var player = playerRepository.findById(1L).get();
        playerRepository.delete(player);
    }

}
