//================================================================================
// This class is made by:
// - Sven Westerlaken
//================================================================================

package informatica.groep1.bioscoopapp.domain;

public class ShowTitleRow {
    private int screeningID;
    private String title;

    public ShowTitleRow(int screeningID, String title) {
        this.screeningID = screeningID;
        this.title = title;
    }
    
    public ShowTitleRow() {
        
    }

    public int getScreeningID() {
        return screeningID;
    }

    public void setScreeningID(int screeningID) {
        this.screeningID = screeningID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}