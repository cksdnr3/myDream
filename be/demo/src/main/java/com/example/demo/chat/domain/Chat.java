package com.example.demo.chat.domain;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "chats")
public class Chat {
		
	
	@Id
	@GeneratedValue
	@Column(name = "board_no")
	private long boardNo;

	@Column(name ="messages")
	private String messages;

	@Column(name = "title")
	private String title;

	@Column(name = "username")
	private String username;

	@Column(name = "regdate")
	private String regdate;

		

	}

