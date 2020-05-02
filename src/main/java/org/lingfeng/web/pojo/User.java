package org.lingfeng.web.pojo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * Created by lingfeng on 2020/5/2.
 */
@Data
@Entity
@Table(name="t_system_user")
public class User {

  @Id
  @GeneratedValue
  private int idSystemUser;

  private String userName;

  private int userAge;

  private int workStatus;

  private String workCode;

  private String createBy;

  private Date createDate;

  private String updateBy;

  private Date updateDate;

}
