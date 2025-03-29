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
			System.out.println("1. Add new post\n2. Display all posts\n3. Update Post\n 4. Fetch Post\n5. Delete Post\n6. Exit");
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
				System.out.println("Enter post id: ");
				int update_id = sc.nextInt();
				user.updatePost(update_id);
				break;
			case 4:
				System.out.println("Enter post ID: ");
				int fetch_id = sc.nextInt();
				user.fetchPost(fetch_id);
				break;
			case 5:
				System.out.println("Enter post ID: ");
				int delete_id = sc.nextInt();
				user.deletePost(delete_id);
			case 6:
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