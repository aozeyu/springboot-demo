package top.codingmore.tobebetterjavaer.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @program: tobebetterjavaer
 * @description: 233
 * @packagename: top.codingmore.tobebetterjavaer.pojo
 * @author: 姚泽宇
 * @date: 2022-06-16 00:14
 **/

@Entity
@Data
@Table(name = "user")
public class User {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 10)
    private String name;

    @Column(name = "password", nullable = false, length = 10)
    private String password;

    @Column(name = "age", nullable = false)
    private Integer age;

    // 省略 getter/setter

}