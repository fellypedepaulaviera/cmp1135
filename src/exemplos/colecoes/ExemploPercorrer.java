package exemplos.colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import exemplos.entidade.EAluno;

public class ExemploPercorrer {

	public static void main(String[] args) {

		List<EAluno> listaAlunos = new ArrayList<EAluno>();
		listaAlunos.add(new EAluno(1, "Heider", 6, 8));
		listaAlunos.add(new EAluno(2, "Ana Paula", 8, 10));
		listaAlunos.add(new EAluno(3, "Pedro Henrique", 6, 9));
		listaAlunos.add(new EAluno(4, "Zenit", 5, 9));
		listaAlunos.add(new EAluno(5, "Ester", 9, 10));
		listaAlunos.add(new EAluno(6, "Laerte", 8, 9));

		// The following code sequentially iterates through a collection of
		// alunos and prints out
		listaAlunos.stream().filter(e -> e.getId() == 3).forEach(e -> System.out.println(e.getNome()));

		// if the collection is large enough and your computer has enough cores
		listaAlunos.parallelStream().filter(e -> e.getId() == 6).forEach(e -> System.out.println(e.getNome()));

		// convert the elements of a Collection to String objects, then join
		// them, separated by commas
		String joined = listaAlunos.stream().map(Object::toString).collect(Collectors.joining(", "));

		System.out.println(joined);

		// sum the N1 of all alunos:
		double soma = listaAlunos.stream().collect(Collectors.summingDouble(EAluno::getN1));
		System.out.println(soma);

		// For-each
		for (EAluno ealuno : listaAlunos) {
			System.out.println(ealuno.getNome());
		}

		// Iterator
		for (Iterator<EAluno> it = listaAlunos.iterator(); it.hasNext();) {
			EAluno ealuno = it.next();
			System.out.println(ealuno.getNome());
		}

		/*
		 * List Algorithms
		 * 
		 * Most polymorphic algorithms in the Collections class apply
		 * specifically to List. Having all these algorithms at your disposal
		 * makes it very easy to manipulate lists. Here's a summary of these
		 * algorithms, which are described in more detail in the Algorithms
		 * section.
		 * 
		 * sort — sorts a List using a merge sort algorithm, which provides a
		 * fast, stable sort. (A stable sort is one that does not reorder equal
		 * elements.) 
		 * 
		 * shuffle — randomly permutes the elements in a List.
		 * 
		 * reverse — reverses the order of the elements in a List.
		 *  
		 * rotate — rotates all the elements in a List by a specified distance. 
		 * 
		 * swap — swaps the elements at specified positions in a List. 
		 * 
		 * replaceAll — replaces all occurrences of one specified value with another. 
		 * 
		 * fill — overwrites every element in a List with the specified value. 
		 * 
		 * copy — copies the source List into the destination List. 
		 * 
		 * binarySearch — searches for an element in an ordered List using the binary search
		 * algorithm. 
		 * 
		 * indexOfSubList — returns the index of the first sublist of one List that is equal to another. 
		 * 
		 * lastIndexOfSubList — returns the index of the last sublist of one List that is equal to another.
		 * 
		 */
		Name nameArray[] = { new Name("Heider", "Taguatinga"), new Name("Ana Paula", "Moraes"),
				new Name("Pedro Henrique", "Souza"), new Name("Josue", "Messias") };

		List<Name> names = Arrays.asList(nameArray);
		Collections.sort(names);
		System.out.println(names);

		/*
		 * Collection Interface Bulk Operations
		 * 
		 * Bulk operations perform an operation on an entire Collection. You
		 * could implement these shorthand operations using the basic
		 * operations, though in most cases such implementations would be less
		 * efficient. The following are the bulk operations:
		 * 
		 * containsAll — returns true if the target Collection contains all of
		 * the elements in the specified Collection.
		 * 
		 * addAll — adds all of the elements in the specified Collection to the
		 * target Collection.
		 *
		 * removeAll — removes from the target Collection all of its elements
		 * that are also contained in the specified Collection.
		 * 
		 * retainAll — removes from the target Collection all its elements that
		 * are not also contained in the specified Collection. That is, it
		 * retains only those elements in the target Collection that are also
		 * contained in the specified Collection.
		 * 
		 * clear — removes all elements from the Collection.
		 * 
		 */

	}

}
