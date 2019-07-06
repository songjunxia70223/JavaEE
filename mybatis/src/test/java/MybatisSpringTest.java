import example_3.SpringConfig;
import example_3.mapper.HeroMapper;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(SpringConfig.class)
public class MybatisSpringTest {
    private Logger logger = LoggerFactory.getLogger(MybatisSpringTest.class);
    @Autowired(required = false)
    HeroMapper heroMapper;

    @Test
    void mybatis() {
        System.out.println(heroMapper.getOneHero(1));
        System.out.println(heroMapper.getOneHero(1));
    }

    @Test
    void cache() {
        System.out.println("--------------------------Another-----------------------------");
        System.out.println(heroMapper.getOneHero(1));
        System.out.println(heroMapper.getOneHero(1));
    }
}
