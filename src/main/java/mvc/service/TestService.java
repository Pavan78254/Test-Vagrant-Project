package mvc.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import mvc.dao.NewsPaperDao;
import mvc.dto.NewsPaper;

@Component
public class TestService {

	
	List<NewsPaper> list;

	public ModelAndView calculate(double budget) {

		ModelAndView view = new ModelAndView();
		
		list=new ArrayList<NewsPaper>();
		list.add(new NewsPaper("TOI",3,3,3,3,3,5,6));
		list.add(new NewsPaper("Hindu",2.5,2.5,2.5,2.5,2.5,4,4));
		list.add(new NewsPaper("ET",4,4,4,4,4,4,10));
		list.add(new NewsPaper("BM",1.5,1.5,1.5,1.5,1.5,1.5,1.5));
		list.add(new NewsPaper("HT",2,2,2,2,2,4,4));

		ArrayList combination = new ArrayList();

		for (int i = 0; i < list.size(); i++) {
			double weeklyBudget1 = list.get(i).getMonday() + list.get(i).getTuesday() + list.get(i).getWednesday()
					+ list.get(i).getThursday() + list.get(i).getFriday() + list.get(i).getSaturday()
					+ list.get(i).getSunday();
			for (int j = i + 1; j < list.size(); j++) {
				double weeklyBudget2 = list.get(j).getMonday() + list.get(j).getTuesday() + list.get(j).getWednesday()
						+ list.get(j).getThursday() + list.get(j).getFriday() + list.get(j).getSaturday()
						+ list.get(j).getSunday();
				if (weeklyBudget1 + weeklyBudget2 <= budget) {
					String[] arr = { list.get(i).getName(), list.get(j).getName() };
					combination.add(Arrays.toString(arr));
				}
			}
		}
		view.setViewName("Result.jsp");
		view.addObject("combination", combination);
		view.addObject("budget", budget);
		return view;
	}

}
