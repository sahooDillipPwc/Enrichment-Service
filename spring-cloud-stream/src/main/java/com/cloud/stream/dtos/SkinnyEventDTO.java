package com.cloud.stream.dtos;

import lombok.*;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@Component
public class SkinnyEventDTO {
    private String policyNumber;
    private String quoteNum;
    private Date effectiveDate;
    private String title;
}
