package Bootcamp_Difficult;

import java.util.Comparator;

public class difficult_3_quicksort_algorithm {
	
	    String name;
	    int age;

	    public void Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	    public String getName() {        return name;    }

	    public int getAge() {        return age;    }

	     @Override
	    public String toString() {
	        return "Person{name='" + name + "', age=" + age + '}';
	    }
	}


	public class QuickSort {

	    public static <T> void quicksort(T[] array, int low, int high, Comparator<T> comparator) {
	        if (low < high) {
	            int pi = partition(array, low, high, comparator);

	            // Recursively sort elements before and after partition
	            quicksort(array, low, pi - 1, comparator);
	            quicksort(array, pi + 1, high, comparator);
	        }
	    }

	    // Method to partition the array
	    private static <T> int partition(T[] array, int low, int high, Comparator<T> comparator) {
	        T pivot = array[high];
	        int i = (low - 1); // Index of smaller element

	        for (int j = low; j < high; j++) {
	            // If the current element is less than or equal to the pivot
	            if (comparator.compare(array[j], pivot) <= 0) {
	                i++;

	                // Swap array[i] and array[j]
	                T temp = array[i];
	                array[i] = array[j];
	                array[j] = temp;
	            }
	        }

	        // Swap array[i + 1] and array[high] (or pivot)
	        T temp = array[i + 1];
	        array[i + 1] = array[high];
	        array[high] = temp;

	        return i + 1;
	    }
	}



	///// Test the Quicksort Algorithm

	public class Main {
	    public static void main(String[] args) {
	        Person[] people = {
	            new Person("Alice", 30),
	            new Person("Bob", 25),
	            new Person("Charlie", 35),
	            new Person("Diana", 28)
	        };

	        System.out.println("Before sorting:");
	        for (Person person : people) {
	            System.out.println(person);
	        }

	        // Define a comparator to sort by age
	        Comparator<Person> ageComparator = Comparator.comparingInt(Person::getAge);

	        // Sort the array using quicksort
	        QuickSort.quicksort(people, 0, people.length - 1, ageComparator);

	        System.out.println("\nAfter sorting by age:");
	        for (Person person : people) {
	            System.out.println(person);
	        }
	    }
	}


}
