import java.util.ArrayList;
import java.util.List;

public class TodoList {
	List<TodoListItem> itemList = new ArrayList<TodoListItem>();
    /*
     * Add a new item to the list, given a description and priority.
     */
    public void addItem(String description, int priority) {
    	TodoListItem item = new TodoListItem(description, priority);
    	itemList.add(item);
    }
    
    /*
     * Get the item at a given index.
     */
    public TodoListItem getItem(int i) {
        return itemList.get(i);
    }
    
    /*
     * Get the number of items in the list.
     */
    public int size() {
        return itemList.size();
    }
    
    /*
     * Find the first item in the list which is not marked "done".
     * If all items are marked "done", this method returns null.
     */
    public TodoListItem findFirstNotDone() {
        for(TodoListItem i : itemList) {
        	if (i.isDone() == false) {
        		return i;
        	}
        }
        return null;
    }
    
    /*
     * Find the highest-priority item which is not marked "done".
     * If all items are marked "done", this method returns null.
     */
    public TodoListItem findHighestPriorityNotDone() {
        TodoListItem hp = itemList.get(0);
        for(TodoListItem i : itemList) {
        	if (hp.getPriority() < i.getPriority()) {
        		if (i.isDone() == false) {
        			hp = i;
        		}
        	}
        }
        return hp;
    }
    
    /*
     * Search for items whose description contains the given text.
     * The descriptions are returned in a list.
     */
    public List<String> search(String text) {
        // accidentally destroyed because the undo button is right next to the save all button
        return null;
    }
}
