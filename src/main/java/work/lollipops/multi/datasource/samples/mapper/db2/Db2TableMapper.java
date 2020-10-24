package work.lollipops.multi.datasource.samples.mapper.db2;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import work.lollipops.multi.datasource.samples.model.User;

/**
 * @author zhaohaoren
 */
@Repository
public interface Db2TableMapper extends BaseMapper<User> {
}
