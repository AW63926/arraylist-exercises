import java.util.ArrayList;

public class ArrayListExercise {

	public static void main(String[] args) {
		ArrayList<String> animalList = new ArrayList<String>();
		animalList.add("Tiger");
		animalList.add("Lion");
		animalList.add("Cheeta");
		animalList.add("Jaguar");
		animalList.add("Snow Leopard");

		for (String i : animalList) {
			System.out.println(i);
		}

		ArrayList<Boolean> boolValues = new ArrayList<Boolean>();
		boolValues.add(true);
		boolValues.add(false);
		boolValues.add(false);
		boolValues.add(true);
		boolValues.add(false);

		for (Boolean i : boolValues) {
			if (i == true) {
				System.out.println("Better bring an umbrella!");
			} else {
				System.out.println("No rain today, enjoy the sun!");
			}
		}

		ArrayList<Integer> intValues = new ArrayList<Integer>();
		int[] numbers = { 1, 23, 9, 77, 922, 6, 32, 63, 14, 5 };
		for (int i = 0; i < numbers.length; i++) {
			intValues.add(numbers[i]);
		}
		for (Integer j : intValues) {
			System.out.println(j + " From ArrayList");
		}
		System.out.println(intValues.indexOf(77) + " index Value");
		intValues.remove(3);
		for(Integer k : intValues) {
			System.out.println(k + " remove test");
		}
		System.out.println(intValues.contains(77));
		
		
		ArrayList<Integer> bullshit = new ArrayList<Integer>();
		int[] numbersList = {20, 40, 60, 80, 120};
		

	}
}
