package ToDoApp.Model;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="todo")
public class ToDo
{
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
     private long id;
	 @Column
     private String title;
	 @Column
	 @DateTimeFormat(pattern="yyyy-MM-dd")
     private Date date;
	 @Column
     private String status;
     
    
	public ToDo() {
	}
	public ToDo(long id, String title, Date date, String status)
	{
		this.id = id;
		this.title = title;
		this.date = date;
		this.status = status;
	}
	public long getId()
	{
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
