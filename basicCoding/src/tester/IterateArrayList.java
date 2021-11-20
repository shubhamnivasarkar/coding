package tester;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

import org.w3c.dom.css.DocumentCSS;

public class IterateArrayList  {

	public static void main(String[] args) {

		List<String> tvSeries = new ArrayList<String>();
		System.out.println(tvSeries.size());
		tvSeries.add("Game Of Thrones");
		tvSeries.add("Breaking Bad");
		tvSeries.add("Big Bang Theory");
		tvSeries.add("The Walking Dead");
		tvSeries.add("Prison Break");
		System.out.println(tvSeries.size());
		System.out.println(tvSeries);
		System.out.println(tvSeries.size());
		// 1. using JAVA 8 for each loop and lambda expression
		System.out.println("------------------FOR_EACH(LAMBDA EXPRESSION)------------------");
		tvSeries.forEach(shows -> {
			System.out.println(shows);

		});

		System.out.println("------------------Iterator------------------");

		/// 2. Iterator

		Iterator<String> it = tvSeries.iterator();
		while (it.hasNext()) {
			String shows = it.next();
			System.out.println(shows);
		}

		// java 8 forEachRemainninng() method
		System.out.println("------------------Iterator lambda and  forEachRemaining------------------");

		it = tvSeries.iterator();
		it.forEachRemaining(show -> {
			System.out.println(show);
		});

		// simple for each loop
		System.out.println("------------------Iterator------------------");

		for (String show : tvSeries) {
			System.out.println(show);
		}

		// for loop with index/order
		System.out.println("------------------for  loop standard------------------");
		for (int i = 0; i < tvSeries.size(); i++) {
			System.out.println(tvSeries.get(i));
		}

		// using a list iterator() in both the directions
		System.out.println("------------------listIterator ------------------");
		ListIterator<String> tvSeriesListIterator = tvSeries.listIterator(tvSeries.size());
		while (tvSeriesListIterator.hasPrevious()) {
			String show = tvSeriesListIterator.previous();
			System.out.println(show);
		}

	}

}
