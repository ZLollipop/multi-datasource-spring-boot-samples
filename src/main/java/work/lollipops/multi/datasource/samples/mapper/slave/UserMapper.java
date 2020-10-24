package work.lollipops.multi.datasource.samples.mapper.slave;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import work.lollipops.multi.datasource.samples.model.User;

/**
 * @author zhaohaoren
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
