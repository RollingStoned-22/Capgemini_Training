package one_to_many;

public class User {
	String user_name;
	Post posts[];
	static int count = 0;
	
	public User(String user_name, int size) {
		this.user_name = user_name;
		this.posts = new Post[size];
	}
	
	public void addPost(Post post) {
		if(count < posts.length) {
			posts[count++] = post;
			System.out.println("New Post added!");
		}
	}
	
	public void displayPosts() {
		for(int i = 0; i < posts.length; i++)
			System.out.println(posts[i].id+"\t"+posts[i].post_caption);
	}
}
