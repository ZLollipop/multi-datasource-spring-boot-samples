package work.lollipops.multi.datasource.samples.mapper.db2;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import work.lollipops.multi.datasource.samples.model.Tb2;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @author zhaohaoren
 */
@Repository
public interface TB2Mapper extends BaseMapper<Tb2> {
    List<Tb2> selectByPrimaryKey(@PathParam("id") Integer id);
}