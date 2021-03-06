package tk.jingzing.repository;

import org.springframework.data.repository.CrudRepository;
import tk.jingzing.bean.UserInfo;

/**
 * UserInfo持久化类;
 * Created by wangyunjing on 2016/12/16.
 */
public interface UserInfoRepository extends CrudRepository<UserInfo,Long> {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
