package ru.clevertack.testingList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.openjdk.jmh.runner.RunnerException;

public class RunnerListTesting {
	private static int max = 20_000_000;

	public static void main(String[] args) throws RunnerException {
		long timeout;
		List<String> linkedList = new LinkedList<>();
		List<String> arrayList = new ArrayList<>();
		ListService ls = new ListService();
		// Заполняем листы LinkedList
		for (int i = 0; i <= 11; i++) {
			arrayList = new ArrayList<>();
			System.out.println("ArrayList " + ls.fillArray(arrayList, max) + " " + arrayList.size());
		}
		// Заполняем листы LinkedList
		for (int i = 0; i <= 11; i++) {
			linkedList = new LinkedList<>();
			System.out.println("LinkedList: " + ls.fillArray(linkedList, max) + " " + linkedList.size());
		}
		for (int i = 0; i <= 5; i++)
			System.out.println("Добавить в начало ArrayList " + ls.addFirst(arrayList) + " " + arrayList.size());
		for (int i = 0; i <= 5; i++)
			System.out.println("Добавить в начало LinkedList " + ls.addFirst(linkedList) + " " + linkedList.size());
		
		for (int i = 0; i <= 5; i++)
			System.out.println("Добавить в конец ArrayList " + ls.addEnd(arrayList) + " " + arrayList.size());
		for (int i = 0; i <= 5; i++)
			System.out.println("Добавить в конец LinkedList " + ls.addEnd(linkedList) + " " + linkedList.size());
		
		for (int i = 0; i <= 5; i++)
			System.out.println("Добавить в середину ArrayList " + ls.addMiddle(arrayList) + " " + arrayList.size());
		for (int i = 0; i <= 5; i++)
			System.out.println("Добавить в середину LinkedList " + ls.addMiddle(linkedList) + " " + linkedList.size());

//

	}

}
