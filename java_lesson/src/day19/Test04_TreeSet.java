package day19;

import java.util.*;
public class Test04_TreeSet {

	public Test04_TreeSet() {
		TreeSet set = new TreeSet();
		set.add("제니");
		set.add("리사");
		set.add("로제");
		set.add("지수");
		
		System.out.println(set);
		System.out.println();
		ArrayList list = new ArrayList(set);
		for(int i = 0 ; i < list.size(); i++ ) {
			System.out.println((String) list.get(i));
		}
		/*
		set.add(1);
		set.add(3.14);
		*/
		
		TreeSet set1 = new TreeSet();
		Circle c = new Circle(20);
		set1.add(c);
		set1.add(new Circle(20));
		set1.add(new Circle(5));
		set1.add(new Circle(5));
		set1.add(new Circle(5));
		set1.add(new Circle(5));
		set1.add(new Circle(5));
		set1.add(new Circle(3));
		
		System.out.println(set1);
		
		TreeSet set2 = new TreeSet(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Circle c1 = (Circle) o1;
				Circle c2 = (Circle) o2;
				return c1.getRad() - c2.getRad();
			}
			
		});
		
		set2.add(new Circle(3));
		set2.add(new Circle(7));
		set2.add(new Circle(5));
		set2.add(new Circle(10));
		set2.add(new Circle(3));
		set2.add(new Circle(10));
		
		System.out.println(set2);
	}

	public static void main(String[] args) {
		new Test04_TreeSet();
	}

}
