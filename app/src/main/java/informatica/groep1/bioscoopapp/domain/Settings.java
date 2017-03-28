//================================================================================
// This class is made by:
// - Devon Marsham
//================================================================================
package informatica.groep1.bioscoopapp.domain;


public class Settings {
    //================================================================================
    // Properties
    //================================================================================

    private String key;
    private String value;

    //================================================================================
    // Properties
    //================================================================================

    public Settings(String key, String value) {
        this.key = key;
        this.value = value;
    }

    //================================================================================
    // Accessors
    //================================================================================

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    //================================================================================
    // Mutators
    //================================================================================


    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }
}