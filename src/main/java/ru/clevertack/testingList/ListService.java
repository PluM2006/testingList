package ru.clevertack.testingList;

import java.util.List;

public class ListService {

	public long fillArray(List<String> list, int max) {
		long timeout = System.currentTimeMillis();
		for (int i = 0; i <= max; i++) {
			list.add("46");
		}
		return timeout = System.currentTimeMillis() - timeout;
	}

	public long addFirst(List<String> list) {
		long timeout = System.currentTimeMillis();
		list.add(0, "646");
		return timeout = System.currentTimeMillis() - timeout;
	}

	public long addEnd(List<String> list) {
		long timeout = System.currentTimeMillis();
		list.add(list.size() - 1, "646");
		return timeout = System.currentTimeMillis() - timeout;
	}
	
	public long addMiddle(List<String> list) {
		long timeout = System.currentTimeMillis();
		list.add(list.size()/2, "646");
		return timeout =  System.currentTimeMillis() - timeout;
	}

}
