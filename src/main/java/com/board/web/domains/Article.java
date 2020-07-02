package com.board.web.domains;
/**
 * @FileName : Test.java
 * @Project : 회원전용게시판
 * @Date : 2020. 7. 1. 
 * @작성자 : wnsghk16@naver.com
 * @설명 : 게시글DTO
 * articleNumber : 
 * fileNumber : 
 * userid: 
 * comment : 
 * message : 
 * rating : 
 * boardType : 
 * title : 
 * content : 
 */

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import lombok.Data;

@Lazy
@Data
@Component
public class Article {
	private int articleNumber, fileNumber;
	private String userid, comments, message, rating, boardtype, title, content; 
}