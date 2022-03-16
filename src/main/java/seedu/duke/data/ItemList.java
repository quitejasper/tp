package seedu.duke.data;

import seedu.duke.data.Item;

import java.util.ArrayList;

/**
 * Wraps all data at item list level
 */
public class ItemList {
    private ArrayList<Item> itemList;

    /**
     * Creates an ItemList using the items in {@code itemList}
     * @param itemList List of items.
     */
    public ItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    /**
     * Adds an item into the item list.
     * @param item Item to be added.
     */
    public void addItem(Item item) {
        this.itemList.add(item);
    }

    /**
     * Removes an item from the list using specified {@code index}.
     * @param index Index of the item to be removed.
     * @return Item that was removed.
     */
    public Item removeItem(int index) {
        return this.itemList.remove(index);
    }

    /**
     * Retrieves an item from the list using specified {@code index}.
     * @param index Index of the item to retrieve.
     * @return Item that was retrieved.
     */
    public Item getItem(int index) {
        return this.itemList.get(index);
    }

    /**
     * Retrieves the size of the item list.
     * @return Size of the item list.
     */
    public int getSize() {
        return this.itemList.size();
    }
}
