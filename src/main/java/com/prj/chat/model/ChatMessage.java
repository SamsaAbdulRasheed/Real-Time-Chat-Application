package com.prj.chat.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor	//Generates a no-argument constructor
public class ChatMessage {
    @JsonProperty("id")
	private Long id;
    @JsonProperty("sender")
	private String sender;
    @JsonProperty("content")
	private String content;
	
	

}
