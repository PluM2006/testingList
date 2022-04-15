package ru.clevertack.testingList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

public class BenchmarkService {
	private static int max = 100_000;

	@State(Scope.Thread)
	public static class FillList {
		Random random = new Random();
		private List<String> listArray = new ArrayList<>();
		private List<String> listLinked = new LinkedList<>();

		@Setup(Level.Iteration)
		public void setup() {
			for (int i = 0; i <= max; i++) {
				listArray.add("46");
				listLinked.add("46");
			}
		}
	}
	//ArrayList Benchmark
	@Benchmark
	public void addArrayListFirst(FillList list, Blackhole bh) {
		list.listArray.add(0, "46");
	}
	@Benchmark
	public void addArrayListMiddle(FillList list, Blackhole bh) {
		list.listArray.add(max / 2 + list.random.nextInt(10), "46");
		
	}
	@Benchmark
	public void addArrayListEnd(FillList list, Blackhole bh) {
		list.listArray.add(max, "46");
		
	}
	@Benchmark
	public void getArrayListMiddle(FillList list, Blackhole bh) {
		String s = list.listArray.get(max / 2 + list.random.nextInt(10));
		bh.consume(s);
	}
	
	//LinkedListList Benchmark
	@Benchmark
	public void getLinkedListMiddle(FillList list, Blackhole bh) {
		String s = list.listLinked.get(max / 2 + list.random.nextInt(10));
		bh.consume(s);
	}

}
