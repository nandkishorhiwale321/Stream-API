package method_ref;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Collect_Collector {
	public static void main (String [] args) {
		/*
		 * string 
		 */
	
		List<Integer> list = List.of(10,02,3,21,45,65,44,88,50).stream()
				.filter(i->i%2==0).collect(Collectors.toList());
				list.forEach((i)->{System.out.println(i);});
		
	}

}
class EvenColl implements Collector <Integer,List<Integer>,List<Integer>>{

	@Override
	public Supplier<List<Integer>> supplier() {
		return ()->{return new Integer();};
	}

	@Override
	public BiConsumer<List<Integer>, Integer> accumulator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BinaryOperator<List<Integer>> combiner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Function<List<Integer>, List<Integer>> finisher() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Characteristics> characteristics() {
		// TODO Auto-generated method stub
		return null;
	}

	
}