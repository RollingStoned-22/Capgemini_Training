package hashmap_implementation;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map map = new Map();
		boolean flag = true;
		while(flag) {
			System.out.println("1. Put\n2. Get value with key\n3. Display map\n4. Delete Entry\n5. Exit");
			int ch = sc.nextInt();
			switch(ch){
			case 1:
				System.out.println("Enter key and value: ");
				int key1 = sc.nextInt();
				int value1 = sc.nextInt();
				map.put(key1, value1);
				break;
			case 2:
				System.out.println("Enter target key: ");
				int key2 = sc.nextInt();
				Object value = map.getValue(key2);
				if(value == (Object)Integer.MIN_VALUE)
					System.out.println("Key doesn't exist");
				else
					System.out.println("Value: "+value);
				break;
			case 3:
				System.out.println("Hash Map:");
				map.displayMap();
				break;
			case 4:
				System.out.println("Enter target key: ");
				int key4 = sc.nextInt();
				map.delete(key4);
				break;
			case 5:
				flag = false;
				System.out.println("Thank You");
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
		sc.close();
	}
}
