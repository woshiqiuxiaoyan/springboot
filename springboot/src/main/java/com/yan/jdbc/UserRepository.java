package com.yan.jdbc;
import com.yan.pojo.User;
import org.springframework.data.repository.CrudRepository;



public interface UserRepository extends CrudRepository<User, Long> {

}
