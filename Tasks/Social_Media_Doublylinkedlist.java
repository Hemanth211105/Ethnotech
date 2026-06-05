class Post
{
    String content;
    Post prev;
    Post next;
    Post(String content) 
	{
        this.content = content;
    }
}
public class Social_Media_Doublylinkedlist 
{
    static Post deleteFirstPost(Post head) 
	{
        if (head == null || head.next == null) 
		{
            return null;
        }
        Post temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
        return head;
    }
    static Post addNewPost(Post head, String content) {
        Post newPost = new Post(content);
        if (head == null) {
            return newPost;
        }
        newPost.next = head;
        head.prev = newPost;
        return newPost;
    }
    static Post lastPost(Post head) {
        Post temp = head;
        while (temp.next != null) {
            temp = temp.next;
 
 }
        return temp;
    }
    public static void main(String[] args) {
        Post p1 = new Post("Good Morning");
        Post p2 = new Post("Bharath uploaded a Video");
        Post p3 = new Post("Harsha also reposted a reel");
        Post p4 = new Post("Friends enjoyed a weekend trip");
        p1.next = p2;
        p2.prev = p1;
        p2.next = p3;
        p3.prev = p2;
        p3.next = p4;
        p4.prev = p3;
        Post head = p1;
        System.out.println("\nDisplay :");
        Post temp = head;
        while (temp != null) {
            System.out.println(temp.content);
            temp = temp.next;
        }
        System.out.println("\nDeleting :");
        head = deleteFirstPost(head);
        temp = head;
        while (temp != null) {
            System.out.println(temp.content);
            temp = temp.next;
        }
        System.out.println("\nAdding :");
        head = addNewPost(head, "Revanth celebrated RCB victory");
        temp = head;
        while (temp != null) {
            System.out.println(temp.content);
            temp = temp.next;
        }
        System.out.println("\nBackward:");
        Post last = lastPost(head);
        while (last != null) {
            System.out.println(last.content);
            last = last.prev;
        }
    }
}