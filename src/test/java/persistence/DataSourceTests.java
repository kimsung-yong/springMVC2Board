package persistence;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:/spring/applicationContext.xml")
@Log4j
public class DataSourceTests {

    @Setter(onMethod_ = @Autowired)
    private DataSource dataSource;

}
