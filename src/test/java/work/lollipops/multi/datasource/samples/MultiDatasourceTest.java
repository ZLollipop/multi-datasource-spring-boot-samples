package work.lollipops.multi.datasource.samples;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import work.lollipops.multi.datasource.samples.mapper.db1.TB1Mapper;
import work.lollipops.multi.datasource.samples.mapper.db2.TB2Mapper;
import work.lollipops.multi.datasource.samples.mapper.db3.TB3Mapper;

@Slf4j
@SpringBootTest
//@RunWith(SpringRunner.class)
public class MultiDatasourceTest {

    @Autowired
    TB1Mapper tb1Mapper;
    @Autowired
    TB2Mapper tb2Mapper;
    @Autowired
    TB3Mapper tb3Mapper;

    @Test
    public void test() {
        log.info("From Database DB1 Result: {}", tb1Mapper.selectByPrimaryKey(1));
        log.info("From Database DB2 Result: {}", tb2Mapper.selectByPrimaryKey(2));
        log.info("From Database DB3 Result: {}", tb3Mapper.selectByPrimaryKey(3));
    }
}
