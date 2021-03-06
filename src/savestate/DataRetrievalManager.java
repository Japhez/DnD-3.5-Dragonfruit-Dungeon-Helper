package savestate;

import character.CharacterBasicInfo;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Data is stored within classes than extend StateSender, classes (usually GUI
 * components) that implement StateReader depend on the data stored within the
 * extended classes.
 *
 * This class provides the methods that allow a Reader to link to a Sender
 * (linkReader()).
 *
 * 1. The data source needs to extend StateSender.  In methods where data is
 *    changed, it should call stateChanged() to signal the change.
 * 2. The data reader (usually a GUI element), needs to implement StateReader 
 *    and the loadInfo() method to call isDataChanged(), and if true then load 
 *    whatever data it needs.
 * 3. A Sender should signal that its data has changed with dataChanged().
 * 4. The Reader's loadInfo method should be called when it needs to verify
 *    that it has the most up-to-date data.  It will only load data if
 *    isDataChanged() returns true.
 * 5. The reader should then call dataRead() to signal that it doesn't need
 *    updates until the Sender changes again.
 *
 * @author Japhez
 */
public abstract class DataRetrievalManager {

    //Master list
    private static final HashMap<StateSender, ArrayList<StateReader>> masterList = new HashMap<>();
    //Current list
    private static final HashMap<StateSender, ArrayList<StateReader>> currentList = new HashMap<>();

    /**
     * Updates the current list of readers that need to retrieve the updated
     * data from the sender, removing the passed reader from the list.
     *
     * @param sender
     * @param reader
     */
    public static void dataRead(StateSender sender, StateReader reader) {
        System.out.println(reader.getClass() + " ACKNOWLEDGES updated data from " + sender.getClass());
        boolean successfullyRemoved = currentList.get(sender).remove(reader);
        if (!successfullyRemoved) {
            System.out.println("...but was it necessary?");
        }
    }

    /**
     * Called when data is changed, this resets the "read" status for any
     * readers that use the passed StateTracker.
     *
     * @param sender
     */
    public static void dataChanged(StateSender sender) {
        //Add to list if not already there
        if (masterList.get(sender) == null) {
            masterList.put(sender, new ArrayList<StateReader>());
            currentList.put(sender, new ArrayList<StateReader>());
        }
        //Clear current list
        currentList.get(sender).clear();
        //Add each reader from the master list to current list
        ArrayList<StateReader> get = masterList.get(sender);
        System.out.println(sender.getClass() + " data source CHANGED...");
        for (StateReader infoReader : get) {
            System.out.println("..." + infoReader.getClass() + " QUEUED to retrieve data.");
            currentList.get(sender).add(infoReader);
        }
    }

    /**
     * @param source
     * @param reader
     * @return true if the passed reader needs to update their data from the
     * passed source.
     */
    public static boolean isDataChanged(StateSender source, StateReader reader) {
        //Add source to master list if it hasn't been added yet
        if (masterList.get(source) == null) {
            masterList.put(source, new ArrayList<StateReader>());
        }
        if (masterList.get(source).contains(reader)) {
            return (currentList.get(source).contains(reader));
        }
        throw new RuntimeException("UNLINKED reader " + reader.getClass() + " wants source " + source.getClass());
    }

    /**
     * Links the passed StateReader to the passed StateTracker. After linking,
     * the reader can use the isDataChanged() method to determine whether they
     * need to retrieve new data or not.
     *
     * @param reader
     * @param sender
     */
    public static void linkReader(StateReader reader, StateSender sender) {
        if (masterList.get(sender) == null) {
            System.out.println(reader.getClass() + " LINKED as reader to " + sender.getClass());
            masterList.put(sender, new ArrayList<StateReader>());
            currentList.put(sender, new ArrayList<StateReader>());
        }
        masterList.get(sender).add(reader);
        currentList.get(sender).add(reader);
    }

    public static void main(String[] args) {
        final CharacterBasicInfo characterBasicInfo = new CharacterBasicInfo();
        StateReader reader = new StateReader() {
            @Override
            public void loadInfo() {
                if (DataRetrievalManager.isDataChanged(characterBasicInfo, this)) {
                    System.out.println("Info test load complete.");
                    //Set data as read
                    DataRetrievalManager.dataRead(characterBasicInfo, this);
                }
            }
        };
        DataRetrievalManager.dataChanged(characterBasicInfo);
        DataRetrievalManager.linkReader(reader, characterBasicInfo);
        System.out.println("Calling load method...");
        reader.loadInfo();
        System.out.println("Calling load method...");
        reader.loadInfo();
        characterBasicInfo.setAge(5);
        System.out.println("Age changed.");
        System.out.println("Calling load method...");
        reader.loadInfo();
        System.out.println("Calling load method...");
        reader.loadInfo();
    }
}
