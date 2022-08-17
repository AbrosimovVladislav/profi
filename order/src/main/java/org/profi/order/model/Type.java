package org.profi.order.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Accessors(chain = true)
@Table(name = Type.TYPE_TABLE)
public class Type {

  public static final String TYPE_TABLE = "type";
  public static final String TYPE_ID = "type_id";

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long typeId;

  private String name;

}
