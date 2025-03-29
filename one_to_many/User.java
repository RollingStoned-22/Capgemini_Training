package one_to_many;

import java.util.Scanner;

public class User {
	String user_name;
	Post posts[];
	static int count = 0;
	public static Scanner sc = new Scanner(System.in);

	public User(String user_name, int size) {
		this.user_name = user_name;
		this.posts = new Post[size];
	}

	public void addPost(Post post) {
		if (count < posts.length) {
			posts[count++] = post;
			System.out.println("New Post added!");
		}
	}

	public void displayPosts() {
		for (int i = 0; i < posts.length; i++)
			System.out.println(posts[i].id + "\t" + posts[i].post_caption);
	}

	public void updatePost(int target_id) {
		for (int i = 0; i < count; i++) {
			if (posts[i].id == target_id) {
				System.out.println("Enter new caption: ");
				String new_caption = sc.nextLine();
				posts[i].post_caption = new_caption;
			} else {
				System.out.println("Post id does not exist.");
			}
		}
	}

	public void fetchPost(int target_id) {
		for (int i = 0; i < count; i++) {
			if (posts[i].id == target_id) {
				System.out.println(posts[i].post_caption);
			} else {
				System.out.println("Post id does not exist.");
			}
		}
	}

	public void deletePost(int target_id) {
		for (int i = 0; i < count; i++) {
			if (posts[i].id == target_id) {
				posts[i] = null;
			} else {
				System.out.println("Post id does not exist.");
			}
		}
	}
}
