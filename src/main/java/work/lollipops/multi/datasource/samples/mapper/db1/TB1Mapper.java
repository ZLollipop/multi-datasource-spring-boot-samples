package work.lollipops.multi.datasource.samples.mapper.db1;

import org.springframework.stereotype.Repository;
import work.lollipops.multi.datasource.samples.model.Tb1;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @author zhaohaoren
 */
@Repository
public interface TB1Mapper {
    List<Tb1> selectByPrimaryKey(@PathParam("id") Integer id);
}