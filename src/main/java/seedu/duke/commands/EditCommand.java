package seedu.duke.commands;

import static java.util.Objects.requireNonNull;
import static seedu.duke.common.Messages.ERROR_MESSAGE;
import static seedu.duke.common.Messages.INVALID_INDEX;

import seedu.duke.data.Item;
import seedu.duke.data.ItemList;
import seedu.duke.ui.Ui;

/**
 * Edits an item identified using it's displayed index from the item list.
 */
public class EditCommand extends Command {
    public static final String COMMAND_WORD = "edit";
    public static final String COMMAND_NAME = "Edit Item";
    public static final String USAGE_MESSAGE = "Edits an item given the index";
    public static final String COMMAND_FORMAT = COMMAND_WORD + " [item number]";
    public static final String HELP_MESSAGE = COMMAND_NAME + ":\n" + "[Function] " + USAGE_MESSAGE + ":\n"
            + "[Command Format] " + COMMAND_FORMAT + "\n";
    private final int index;

    /**
     * Creates a DeleteCommand to delete item using specified index.
     *
     * @param index index specified.
     */
    public EditCommand(int index) {
        requireNonNull(index, "no index was indicated!");
        this.index = index;
    }

    @Override
    public void execute(ItemList itemList, Ui ui) {
        assert index != 0 : "index indicated is 0.";

        try {
            Item removedItem = itemList.getItem(index);

            ui.showMessages(removedItem + " has been edited.");
        } catch (ArrayIndexOutOfBoundsException e) {
            ui.showMessages(ERROR_MESSAGE, INVALID_INDEX);
        }
    }
}