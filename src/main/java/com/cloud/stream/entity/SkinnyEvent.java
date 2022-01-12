package com.cloud.stream.entity;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name = "skinnyevent")
@Component
public class SkinnyEvent {
    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "skinnyevent_seq")
//    @SequenceGenerator(name = "skinnyevent_seq",sequenceName = "skinnyevent_seq")
    private Integer id = (int)(Math.random()*100);
    private String policynumber;
    private String quotenum;
    private Date effectivedate;
    private String title;
}
