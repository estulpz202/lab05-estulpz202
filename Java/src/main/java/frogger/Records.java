package frogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Refactor Task 2.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Records {
    private final List<FroggerID> records;

    public Records() {
        this.records = new ArrayList<>();
    }

    /**
     * Adds a frogger's record.
     *
     * @param froggerID stores first name, last name, phone number, 
     *                  zip code, state, and gender of the frogger.
     * @return Return false if the record has existed. Else, return true.
     */
    public boolean addRecord(FroggerID froggerID) {
        for (FroggerID record : this.records) {
            if (froggerID.equals(record)) {
                return false;
            }
        }
        this.records.add(froggerID);
        return true;
    }
}