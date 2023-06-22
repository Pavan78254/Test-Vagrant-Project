package mvc.dto;



import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Data
public class NewsPaper {

	@Id
	String name;
	double monday;
	double tuesday;
	double wednesday;
	double thursday;
	double friday;
	double saturday;
	double sunday;
	public NewsPaper(String name, double monday, double tuesday, double wednesday, double thursday, double friday,
			double saturday, double sunday) {
		
		this.name = name;
		this.monday = monday;
		this.tuesday = tuesday;
		this.wednesday = wednesday;
		this.thursday = thursday;
		this.friday = friday;
		this.saturday = saturday;
		this.sunday = sunday;
	}
	
	
	
}
