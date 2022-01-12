package com.cloud.stream.dtos;


import lombok.*;
import org.springframework.stereotype.Component;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
public class CommonDTO {
    private Integer id;
    private String name;
}
