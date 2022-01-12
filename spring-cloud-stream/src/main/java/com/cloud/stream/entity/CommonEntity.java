package com.cloud.stream.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "enrichment_common")
public class CommonEntity {
    @Id
    private Integer id;
    private String name;
}
