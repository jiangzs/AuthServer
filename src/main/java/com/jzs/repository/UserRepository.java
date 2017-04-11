package com.jzs.repository;

import com.jzs.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jiangzs@gmail.com on 2017/4/7.
 */
@Repository
public interface UserRepository extends CrudRepository<User, String> {
}
