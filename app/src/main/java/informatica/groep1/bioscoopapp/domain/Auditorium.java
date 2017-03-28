package informatica.groep1.bioscoopapp.domain;

/**
 * Created by BlackWolf on 03/28/17.
 */

public class Auditorium {
    //================================================================================
    // Properties
    //================================================================================
    private int auditoriumID;
    private int rows;
    private int seatquantaity;

    //================================================================================
    // Constructer
    //================================================================================
    public Auditorium(int auditoriumID, int rows, int seatquantaity){
        this.auditoriumID = auditoriumID;
        this.rows =rows;
        this.seatquantaity = seatquantaity;
    }

    //================================================================================
    // Accessors
    //================================================================================

    public int getAuditoriumID() {
        return auditoriumID;
    }

    public int getRows() {
        return rows;
    }

    public int getSeatquantaity() {
        return seatquantaity;
    }

    //================================================================================
    // Mutators
    //================================================================================

    public void setAuditoriumID(int auditoriumID) {
        this.auditoriumID = auditoriumID;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setSeatquantaity(int seatquantaity) {
        this.seatquantaity = seatquantaity;
    }
}
