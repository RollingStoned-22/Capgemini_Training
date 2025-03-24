package one_to_many;

import java.util.Scanner;

public class PostDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of posts: ");
		int size = sc.nextInt();

		User user = new User("rock_to", size);
		boolean flag = true;
		while (flag) {
			System.out.println("Enter choice: ");
			System.out.println("1. Add new post\n2.Display all posts\n3.Exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				sc.nextLine();
				System.out.println("Enter caption and id: ");
				String caption = sc.nextLine();
				int id = sc.nextInt();
				Post post = new Post(caption, id);
				user.addPost(post);
				break;
			case 2:
				user.displayPosts();
				break;
			case 3:
				System.out.println("Thank You");
				flag = false;
				break;
			default:
				System.out.println("Wrong input");
			}
		}

		sc.close();
	}
}
