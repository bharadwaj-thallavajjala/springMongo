package com.mongodb.news;

import java.util.Date;
import java.util.UUID;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



/* because it is mongodb connection*/
@Document
public class Article {
	
	
	
	/* id annotated as primary key*/
	@Id
	private ObjectId id;
	
	private UUID authorId;
	
	private String author;
	 
	private Date date;
	
	private String title;
	
	private byte[] text;
	
	public ObjectId getId(){
		return id;
		
	}
	
	public UUID getAuthorId(){
		return authorId;
		
	}
	

	public void setAuthorId(UUID randomUUID) {
		// TODO Auto-generated method stub
		
	}

	public void setAuthorId(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setTitle(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setDate(Date date2) {
		// TODO Auto-generated method stub
		
	}

	public void setAuthor(String string) {
		// TODO Auto-generated method stub
		
	}
	

}
