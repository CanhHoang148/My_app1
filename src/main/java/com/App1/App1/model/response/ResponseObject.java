package com.App1.App1.model.response;

import lombok.*;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseObject {
    private String status;
    private String msg;
    private Object data;
}
