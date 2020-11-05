package work.lollipops.multi.datasource.samples.mapper.db3;

import org.springframework.stereotype.Repository;
import work.lollipops.multi.datasource.samples.model.Tb3;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @author zhaohaoren
 */
@Repository
public interface TB3Mapper {
    List<Tb3> selectByPrimaryKey(@PathParam("id") Integer id);
}