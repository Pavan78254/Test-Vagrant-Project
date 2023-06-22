package mvc.dao;


import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mvc.dto.NewsPaper;



@Repository
public class NewsPaperDao {

	@Autowired
	EntityManager manager;
	
	public List<NewsPaper> fetchAll()
	{
		return manager.createQuery("select x from NewsPaper x").getResultList();
	}
}
